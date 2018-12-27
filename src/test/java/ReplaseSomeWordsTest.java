import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReplaseSomeWordsTest {

    @Test
    public void checkThatWordsReplase() {
        ReplaseSomeWords replase = new ReplaseSomeWords();
        String actual = "Вырезано цензурой\tбыла\tесть\tи\tбудет\tВырезано цензурой\tесли\tне\tперестанет\tбыть\tВырезано цензурой";
        Assert.assertEquals(actual,replase.readAndReplace("бяка была есть и будет бяка если не перестанет быть бяка"));

    }
}