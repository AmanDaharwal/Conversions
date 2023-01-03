package com.conversion.volume;

public class Cup {

    private TableSpoon tableSpoon;

    public Cup(){
        this.tableSpoon = new TableSpoon();
    }

    Double equivalentToTableSpoon(Double cup){
        return cup * 16;
    }

    Double equivalentToTeaSpoon(Double cup){
        return tableSpoon.equivalentToTeaSpoon(equivalentToTableSpoon(cup));
    }

    Double equivalentToPint(Double cup){
        return cup/2;
    }
}
