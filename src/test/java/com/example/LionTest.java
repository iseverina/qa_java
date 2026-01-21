package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class LionTest {
    @Test( expected = Exception.class)
    public void LionInvalidSex() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        new Lion("Другое", felineMock);
    }

    @Test
    public void LionGetKittens () throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getKittens()).thenReturn(7);
        Lion lion = new Lion ("Самец", felineMock);
        int actual = lion.getKittens();
        Assert.assertEquals(7, actual);
        Mockito.verify(felineMock).getKittens();
    }

    @Test
    public void getFoodLion() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", felineMock);
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
        Mockito.verify(felineMock).getFood("Хищник");
    }
}
