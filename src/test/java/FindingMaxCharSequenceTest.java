import org.testng.Assert;

import static org.testng.Assert.*;

public class FindingMaxCharSequenceTest {
    @org.testng.annotations.Test
    public void checkMinBoundaryValues() {
        FindingMaxCharSequence max = new FindingMaxCharSequence();
        String actual = "maxOne 0 & maxZero 0";
        Assert.assertEquals(actual, max.maxCharSequence(""));
    }

    @org.testng.annotations.Test
    public void checkMaxBoundaryValues() {
        FindingMaxCharSequence max = new FindingMaxCharSequence();
        String actual = "maxOne 10 & maxZero 10";
        Assert.assertEquals(actual, max.maxCharSequence("101111111111000000000010"));
    }

    @org.testng.annotations.Test
    public void checkSingleValues() {
        FindingMaxCharSequence max = new FindingMaxCharSequence();
        String actual = "maxOne 1 & maxZero 1";
        Assert.assertEquals(actual, max.maxCharSequence("1010101010101010101010101010"));
    }

    @org.testng.annotations.Test
    public void checkMiddleValues() {
        FindingMaxCharSequence max = new FindingMaxCharSequence();
        String actual = "maxOne 5 & maxZero 5";
        Assert.assertEquals(actual, max.maxCharSequence("00111011101011111010001000001011000"));
    }
}