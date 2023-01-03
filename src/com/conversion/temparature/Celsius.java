package com.conversion.temparature;

public class Celsius {
    Double convertToFahrenheit(Double temperature){
        return temperature * 1.8 + 32;
    }

    Double convertToKelvin(Double temperature){
        return temperature + 273.15;
    }
}