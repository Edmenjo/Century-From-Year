import org.junit.Assert;
import org.junit.Test;

public class CenturyFromYear_ {
    public CenturyFromYear_(){
    }

    @Test
    public void given_year_0_should_return_0() {
        Assert.assertEquals(0,new CenturyFromYear().getCentury(0));
    }
}
