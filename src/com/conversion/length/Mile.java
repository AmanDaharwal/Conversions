package com.conversion.length;

public class Mile {

    private Yard yard;

    public Mile(){
        this.yard = new Yard();
    }

    Double convertToYard(Double mile){
        return mile * 1760;
    }

    Double convertToInch(Double mile){
        return yard.convertToInch(convertToYard(mile));
    }

    Double convertToFeet(Double mile){
        return yard.convertToFeet(convertToYard(mile));
    }
}
