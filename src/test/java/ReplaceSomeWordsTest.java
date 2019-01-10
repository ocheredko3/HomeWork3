import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReplaceSomeWordsTest {

    @Test
    public void checkThatWordsReplase() {
        ReplaceSomeWords replace = new ReplaceSomeWords();
        String actual = "Вырезано цензурой";
        Assert.assertEquals(actual, replace.readAndReplace("Бяка"));
    }

    @Test
    public void checkThatSentenceChanged() {
        ReplaceSomeWords replace = new ReplaceSomeWords();
        String actual = "Он такая вырезано цензурой";
        Assert.assertEquals(actual, replace.readAndReplace("Он такая бяка"));
    }

    @Test
    public void checkThatUperCaseWordsChanged() {
        ReplaceSomeWords replace = new ReplaceSomeWords();
        String actual = "Вырезано цензурой такая вырезано цензурой";
        Assert.assertEquals(actual, replace.readAndReplace("Бяка такая бяка"));
    }
    @Test
    public void checkThatLongSenteceChanged() {
        ReplaceSomeWords replace = new ReplaceSomeWords();
        String actual = "Реальная вырезано цензурой плата в ноябре 2018 года по сравнению с аналогичным месяцем 2017 года увеличилась на 11,4% сообщаят Вырезано цензурой експрес";
        Assert.assertEquals(actual, replace.readAndReplace("Реальная бяка плата в ноябре 2018 года по сравнению с аналогичным месяцем 2017 года увеличилась на 11,4% сообщаят Бяка експрес"));
    }
}