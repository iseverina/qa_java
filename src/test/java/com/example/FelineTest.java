package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FelineTest {
    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();

        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensOne() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens();
        int expectedCount = 1;
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void eatMeatPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }


}
