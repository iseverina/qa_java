package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LionManeParamTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionManeParamTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters

    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{"Самец", true},
                new Object[]{"Самка", false}
        );
    }

    @Test
    public void doesHaveManeExpectedValue() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, felineMock);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, actual);
    }
}
