import org.junit.Assert;
import org.junit.Test;

public class CenturyFromYear_ {
    public CenturyFromYear_(){
    }

    @Test
    public void given_year_0_should_return_0() {
        Assert.assertEquals(0,new CenturyFromYear().getCentury(0));
    }

    @Test
    public void given_1_should_return_1() {
        Assert.assertEquals(1, new CenturyFromYear().getCentury(1));
    }

    @Test
    public void given_1705_should_return_18() {
        Assert.assertEquals(18, new CenturyFromYear().getCentury(1705));
    }

    @Test
    public void given_2000_should_return_20() {
        Assert.assertEquals(20, new CenturyFromYear().getCentury(2000));
    }
}
