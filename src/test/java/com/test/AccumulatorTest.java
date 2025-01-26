package com.test;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {

    @Test
    void test1() {
        Accumulator accumulator = new Accumulator();
        int value = accumulator.accumulate(4);
        if(value != 4){
            throw new RuntimeException("Invalid value");
        }
    }

    @Test
    void test2() {
        Accumulator accumulator = new Accumulator();
        accumulator.accumulate(4);
        int value = accumulator.accumulate(3);

        if(value != 7){
            throw new RuntimeException("Invalid value");
        }
    }

    @Test
    void test3() {
        try {
            Accumulator accumulator = new Accumulator();
            accumulator.accumulate(-2);
            throw new RuntimeException("Negative value shouldn't be provided");
        } catch (IllegalArgumentException e) {

        }
    }
}
