import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by littleyellowboy on 25/09/2017.
 */
public class MyClassTest {

    @Test
    public final void test1(){
        MyClass instance1 = new MyClass("test");

        Assert.assertThat(instance1.getName(),is("test"));
    }
}