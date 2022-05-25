package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class Kata1Test {

    @Test
    public void testExecute() {
//        valorEsperado = ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys");
//        valorActual = Kata1.execute().forEach((elemento -> elemento.get(Map.of())));
        Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
