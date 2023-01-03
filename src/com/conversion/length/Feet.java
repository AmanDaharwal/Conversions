package com.conversion.length;

public class Feet {

    Double convertToYard(Double feet){
        return feet/3;
    }

    Double convertToInch(Double feet){
        return feet * 12;
    }

    Double convertToMile(Double feet){
        return feet/5280;
    }
}
