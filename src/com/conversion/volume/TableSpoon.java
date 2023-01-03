package com.conversion.volume;

public class TableSpoon {

    Double equivalentToTeaSpoon(Double tableSpoon){
        return tableSpoon * 3;
    }

    Double equivalentToCup(Double tableSpoon){
        return tableSpoon/16 ;
    }

    Double equivalentToPint(Double tableSpoon){
        return 2 * equivalentToCup(tableSpoon);
    }
}
