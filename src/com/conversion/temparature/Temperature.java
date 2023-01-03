package com.conversion.temparature;

public class Temperature<T> {
    private T t;
    public void pairConversion(T t){
        this.t = t;
    }

    public Double convertToFahrenheit(Double temp) throws Exception {

        if(t instanceof Celsius){
            return ((Celsius) t).convertToFahrenheit(temp);
        }
        else if(t instanceof Fahrenheit){
            return temp;
        }
        else if(t instanceof Kelvin){
            return ((Kelvin) t).convertToFahrenheit(temp);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double convertToCelsius(Double temp) throws Exception {

        if(t instanceof Celsius){
            return temp;
        }
        else if(t instanceof Fahrenheit){
            return ((Fahrenheit) t).convertToCelsius(temp);
        }
        else if(t instanceof Kelvin){
            return ((Kelvin) t).convertToCelsius(temp);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double convertToKelvin(Double temp) throws Exception {

        if(t instanceof Celsius){
            return ((Celsius) t).convertToKelvin(temp);
        }
        else if(t instanceof Fahrenheit){
            return ((Fahrenheit) t).convertToKelvin(temp);
        }
        else if(t instanceof Kelvin){
            return temp;
        }
        throw new Exception("Incompatible type exception ");
    }
}