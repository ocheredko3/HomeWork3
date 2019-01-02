import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReplaseSomeWordsTest {

    @Test
    public void checkThatWordsReplase() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("бяка"));
    }

    @Test
    public void checkThatSentenceChenged() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Он такая Вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("Он такая бяка"));
    }

    @Test
    public void checkThatUperCaseWordsChenged() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Вырезано цензурой такая Вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("Бяка такая бяка"));
    }
}