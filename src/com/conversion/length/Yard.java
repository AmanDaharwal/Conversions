package com.conversion.length;

public class Yard {

    private Feet feet;

    public Yard(){
        this.feet = new Feet();
    }

    Double convertToFeet(Double yard){
        return yard * 3;
    }

    Double convertToInch(Double yard){
        return feet.convertToInch(convertToFeet(yard));
    }

    Double convertToMile(Double yard){
        return feet.convertToMile(convertToFeet(yard));
    }
}
