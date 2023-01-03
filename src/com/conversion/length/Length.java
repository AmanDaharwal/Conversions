package com.conversion.length;

public class Length<L> {

    private L l;
    public void pairConversion(L l){
        this.l = l;
    }

    public Double convertToFeet(Double length) throws Exception {

        if(l instanceof Inch){
            return ((Inch) l).convertToFeet(length);
        }
        else if(l instanceof Feet){
            return length;
        }
        else if(l instanceof Yard){
            return ((Yard) l).convertToFeet(length);
        }
        else if(l instanceof Mile){
            return ((Mile) l).convertToFeet(length);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double convertToMile(Double length) throws Exception {

        if(l instanceof Inch){
            return ((Inch) l).convertToMile(length);
        }
        else if(l instanceof Feet){
            return ((Feet) l).convertToMile(length);
        }
        else if(l instanceof Yard){
            return ((Yard) l).convertToMile(length);
        }
        else if(l instanceof Mile){
            return length;
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double convertToInch(Double length) throws Exception {

        if(l instanceof Inch){
            return length;
        }
        else if(l instanceof Feet){
            return ((Feet) l).convertToInch(length);
        }
        else if(l instanceof Yard){
            return ((Yard) l).convertToInch(length);
        }
        else if(l instanceof Mile){
            return ((Mile) l).convertToInch(length);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double convertToYard(Double length) throws Exception {

        if(l instanceof Inch){
            return ((Inch) l).convertToYard(length);
        }
        else if(l instanceof Feet){
            return ((Feet) l).convertToYard(length);
        }
        else if(l instanceof Yard){
            return length;
        }
        else if(l instanceof Mile){
            return ((Mile) l).convertToYard(length);
        }
        throw new Exception("Incompatible type exception ");
    }
}
