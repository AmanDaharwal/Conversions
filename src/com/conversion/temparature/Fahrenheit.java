package com.conversion.temparature;

public class Fahrenheit {
    private Kelvin kelvin;

    public Fahrenheit(){
        this.kelvin = new Kelvin();
    }

    Double convertToCelsius(Double temperature){
        return kelvin.convertToCelsius(this.convertToKelvin(temperature));
    }

    Double convertToKelvin(Double temperature){
        return (temperature - 32)/1.8 + 273.15;
    }
}
