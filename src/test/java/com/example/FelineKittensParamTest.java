package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FelineKittensParamTest {
    private final int kittensCount;

    public FelineKittensParamTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList
                (new Object[]{-1},
                new Object[]{0},
                new Object[]{1},
                new Object[]{2});
    }
    @Test
            public void getKittensParamTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(kittensCount, actual);
    }
}


