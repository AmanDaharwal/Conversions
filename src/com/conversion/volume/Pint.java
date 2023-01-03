package com.conversion.volume;

public class Pint {

    private Cup cup;

    public Pint(){
        this.cup = new Cup();
    }

    Double equivalentToCup(Double pint){
        return pint * 2;
    }

    Double equivalentToTableSpoon(Double pint){
        return cup.equivalentToTableSpoon(equivalentToCup(pint));
    }

    Double equivalentToTeaSpoon(Double pint){
        return cup.equivalentToTeaSpoon(equivalentToCup(pint));
    }
}
