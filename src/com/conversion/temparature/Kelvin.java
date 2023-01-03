package com.conversion.temparature;

public class Kelvin {

    private Celsius celsius;
    public Kelvin(){
        this.celsius = new Celsius();
    }

    Double convertToFahrenheit(Double temperature){
        return celsius.convertToFahrenheit(this.convertToCelsius(temperature));
    }

    Double convertToCelsius(Double temperature){
        return temperature - 273.15;
    }
}
