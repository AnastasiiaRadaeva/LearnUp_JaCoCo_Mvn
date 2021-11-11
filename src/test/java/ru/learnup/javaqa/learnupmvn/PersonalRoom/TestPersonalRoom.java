package ru.learnup.javaqa.learnupmvn.PersonalRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestPersonalRoom {
    public PersonalRoom room = new PersonalRoom(0, 0);

    @Test
    public void checkConstructor() {
        PersonalRoom room_new = new PersonalRoom(-2, -6);
        int expected = 0;
        int actual = room_new.getOutcome();
        Assertions.assertEquals(expected, actual, "Constructor OutCome");
        actual = room_new.getIncome();
        Assertions.assertEquals(expected, actual, "Constructor InCome");
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CheckIncrease.csv")
    public void checkIncreaseIncome(int increase, int expectedIncrease) {
        int expected = expectedIncrease;
        room.increaseIncome(increase);
        int actual = room.getIncome();
        Assertions.assertEquals(expected, actual, "Check increaseIncome");
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CheckIncrease.csv")
    public void checkIncreaseOutcome(int increase, int expectedIncrease) {
        int expected = expectedIncrease;
        room.increaseOutcome(increase);
        int actual = room.getOutcome();
        Assertions.assertEquals(expected, actual, "Check increaseOutcome");
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CheckTax.csv")
    public void checkTax(int income, int expectedTax) {
        int expected = expectedTax;
        room.increaseIncome(income);
        int actual = room.getTax();
        Assertions.assertEquals(expected, actual, "Check Tax");
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CheckDiffTax.csv")
    public void checkDiffTax(int income, int outcome, int expectedTax) {
        int expected = expectedTax;
        room.increaseIncome(income);
        room.increaseOutcome(outcome);
        int actual = room.getDiffTax();
        Assertions.assertEquals(expected, actual, "Check diffTax");
    }
}
