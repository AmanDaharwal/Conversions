package com.conversion.volume;

public class TeaSpoon {

    private TableSpoon tableSpoon;

    public TeaSpoon(){
        this.tableSpoon = new TableSpoon();
    }

    Double equivalentToTableSpoon(Double teaSpoon){
        return teaSpoon/3;
    }

    Double equivalentToCup(Double teaSpoon){
        return tableSpoon.equivalentToCup(equivalentToTableSpoon(teaSpoon));
    }

    Double equivalentToPint(Double teaSpoon){
        return tableSpoon.equivalentToPint(equivalentToTableSpoon(teaSpoon));
    }
}
