package ru.learnup.javaqa.learnupmvn.PersonalRoom;

public class PersonalRoom {
    private int income;
    private int outcome;

    public PersonalRoom(int startIncome, int startOutcome) {
        this.income = startIncome < 0 ? 0 : startIncome;
        this.outcome = startOutcome < 0 ? 0 : startOutcome;
    }

    public int getIncome() {
        return this.income;
    }

    public int getOutcome() {
        return this.outcome;
    }

    public void increaseIncome(int increase) {
        this.income += increase < 0 ? 0 : increase;
    }

    public void increaseOutcome(int increase) {
        this.outcome += increase < 0 ? 0 : increase;
    }

    public int getTax() {
        return income * 6 / 100;
    }

    public int getDiffTax() {
        return (income - outcome) <= 0 ? 0 : (income - outcome) * 15 / 100;
    }
}
