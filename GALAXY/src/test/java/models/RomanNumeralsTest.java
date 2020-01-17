package models;

import org.junit.Test;

import org.junit.Assert.*;


public class RomanNumeralsTest {

    @Test
    public void getValueRomanNumber(String symbol){
        RomanNumerals rn = new RomanNumerals();
        assert  rn.eval("Falso") == false;

    }
}
