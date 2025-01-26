package com.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccumulatorTest {

    public AccumulatorTest() {
        System.out.println("AccumulatorTest Constructor");
    }
    Accumulator accumulator = new Accumulator();

    @BeforeEach
     void setup(){
        System.out.println("@BeforeEach");
    }

    @Test
    void test1() {
        int value = accumulator.accumulate(4);
        if(value != 4){
            throw new RuntimeException("Invalid value");
        }
    }

    @Test
    void test2() {

        accumulator.accumulate(4);
        int value = accumulator.accumulate(3);

        if(value != 7){
            throw new RuntimeException("Invalid value");
        }
    }

    @Test
    void test3() {
        try {

            accumulator.accumulate(-2);
            throw new RuntimeException("Negative value shouldn't be provided");
        } catch (IllegalArgumentException e) {

        }
    }
}
