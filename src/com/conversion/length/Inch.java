package com.conversion.length;

public class Inch {

    private Feet feet;

    public Inch(){
        this.feet = new Feet();
    }
    Double convertToFeet(Double inch){
        return inch/12;
    }

    Double convertToMile(Double inch){
        return feet.convertToMile(convertToFeet(inch));
    }

    Double convertToYard(Double inch){
        return feet.convertToYard(convertToFeet(inch));
    }
}
