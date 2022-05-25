package katas;

import com.google.common.collect.ImmutableMap;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class Kata1Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
