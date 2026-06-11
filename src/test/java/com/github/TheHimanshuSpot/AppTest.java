package com.github.TheHimanshuSpot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void sampleTest(){
        Bank bank= new Bank(100000);
        double sum = bank.total();
        bank.transfer(10,20,50000);
        if(bank.total()==sum)
            assertTrue(true);
        else{
            assertTrue(false);
        }

    }
}
