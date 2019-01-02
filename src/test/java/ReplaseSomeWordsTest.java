import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReplaseSomeWordsTest {

    @Test
    public void checkThatWordsReplase() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("Бяка"));
    }

    @Test
    public void checkThatSentenceChenged() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Он такая вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("Он такая бяка"));
    }

    @Test
    public void checkThatUperCaseWordsChenged() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Вырезано цензурой такая вырезано цензурой";
        Assert.assertEquals(actual, replase.readAndReplace("Бяка такая бяка"));
    }
    @Test
    public void checkThatLongSenteceChenged() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Реальная вырезано цензурой плата в ноябре 2018 года по сравнению с аналогичным месяцем 2017 года увеличилась на 11,4% сообщаят Вырезано цензурой експрес";
        Assert.assertEquals(actual, replase.readAndReplace("Реальная бяка плата в ноябре 2018 года по сравнению с аналогичным месяцем 2017 года увеличилась на 11,4% сообщаят Бяка експрес"));
    }
}