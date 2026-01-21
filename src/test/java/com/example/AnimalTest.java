package com.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnimalTest {
    @Test
    public void getFoodHerbivore() throws Exception {
        Animal animal = new Animal();

        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodPredator() throws Exception {
        Animal animal = new Animal();

        List<String> actual = animal.getFood("Хищник");
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodUnknownKind() {
        Animal animal = new Animal();

        try {
            animal.getFood("Пришелец");
            fail("Ожидали Exception для неизвестного вида животного, но исключение не было выброшено");
        } catch (Exception e) {
            String expectedMessage = "Неизвестный вид животного";
            String actualMessage = e.getMessage();
            if (actualMessage == null || !actualMessage.contains(expectedMessage)) {
                fail("Неожиданное сообщение исключения: " + actualMessage);
            }
        }
    }
    @Test
    public void getSpecies() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}




