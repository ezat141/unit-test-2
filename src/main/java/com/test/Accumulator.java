package com.test;

public class Accumulator {

    private int value;

    public int accumulate(int value) {
        if(value < 0) {
            throw new IllegalArgumentException("Negative value provided");
        }

        this.value += value;
        return this.value;
    }
}
