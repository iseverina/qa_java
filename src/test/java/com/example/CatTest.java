package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class CatTest {
    @Test
    public void getSoundCat() {

        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, actualSound);
    }


    @Test
    public void getFoodPredator() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.eatMeat()).thenReturn(expectedFood);
        Cat cat = new Cat(felineMock);
        List<String> actualFood = cat.getFood();
        Assert.assertEquals(expectedFood, actualFood);

    }

    @Test
    public void getFoodMeat() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.eatMeat()).thenThrow(new Exception("БУМ!"));
        Cat cat = new Cat(felineMock);
        try {
            cat.getFood();
            Assert.fail("Ожидали Exception, но его не было");
        } catch (Exception e) {
            Assert.assertEquals("БУМ!", e.getMessage());
        }
    }
}
