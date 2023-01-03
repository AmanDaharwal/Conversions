package com.conversion.volume;

public class Volume<V> {

    private V v;

    public void pairConversion(V v){
        this.v = v;
    }

    public Double equivalentToCup(Double vol) throws Exception {

        if(v instanceof Cup){
            return vol;
        }
        else if(v instanceof Pint){
            return ((Pint) v).equivalentToCup(vol);
        }
        else if(v instanceof TeaSpoon){
            return ((TeaSpoon) v).equivalentToCup(vol);
        }
        else if(v instanceof TableSpoon){
            return ((TableSpoon) v).equivalentToCup(vol);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double equivalentToPint(Double vol) throws Exception {

        if(v instanceof Cup){
            return ((Cup) v).equivalentToPint(vol);
        }
        else if(v instanceof Pint){
            return vol;
        }
        else if(v instanceof TeaSpoon){
            return ((TeaSpoon) v).equivalentToPint(vol);
        }
        else if(v instanceof TableSpoon){
            return ((TableSpoon) v).equivalentToPint(vol);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double equivalentToTeaSpoon(Double vol) throws Exception {

        if(v instanceof Cup){
            return ((Cup) v).equivalentToTeaSpoon(vol);
        }
        else if(v instanceof Pint){
            return ((Pint) v).equivalentToTeaSpoon(vol);
        }
        else if(v instanceof TeaSpoon){
            return vol;
        }
        else if(v instanceof TableSpoon){
            return ((TableSpoon) v).equivalentToTeaSpoon(vol);
        }
        throw new Exception("Incompatible type exception ");
    }

    public Double equivalentToTableSpoon(Double vol) throws Exception {

        if(v instanceof Cup){
            return ((Cup) v).equivalentToTableSpoon(vol);
        }
        else if(v instanceof Pint){
            return ((Pint) v).equivalentToTableSpoon(vol);
        }
        else if(v instanceof TeaSpoon){
            return ((TeaSpoon) v).equivalentToTableSpoon(vol);
        }
        else if(v instanceof TableSpoon){
            return vol;
        }
        throw new Exception("Incompatible type exception ");
    }
}
