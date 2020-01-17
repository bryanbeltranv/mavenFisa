package models;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private Map<String, RomanNumber> RomanNumeralsMap = new HashMap<String, RomanNumber>();

    private String [] symbols = {"I","V","X","L","C","D","M"};

    public RomanNumerals() {
        loadRomanNumerals();
    }

    private void loadRomanNumerals(){

        RomanNumeralsMap.put("I",new RomanNumber("I",1));
        RomanNumeralsMap.put("V",new RomanNumber("V",5));
        RomanNumeralsMap.put("X",new RomanNumber("X",10));
        RomanNumeralsMap.put("L",new RomanNumber("L",50));
        RomanNumeralsMap.put("C",new RomanNumber("C",100));
        RomanNumeralsMap.put("D",new RomanNumber("D",500));
        RomanNumeralsMap.put("M",new RomanNumber("M",1000));
    }

    public int getValueRomanNumber(String symbol){
        return RomanNumeralsMap.get(symbol).getValue();
    }

    public String[] getSymbols() {
        return symbols;
    }
        public boolean eval(String s) {
            return true;
        }
    }

