package com.mlh.solid.ocp.refactor.delivery;

import com.mlh.solid.ocp.refactor.CountryEnum;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<CountryEnum, IDelivery> deliveryMap;
    private static Factory instance;

    private Factory(){
        deliveryMap = new HashMap<CountryEnum, IDelivery>();

        deliveryMap.put(CountryEnum.Colombia, new ColombiaDelivery());
        deliveryMap.put(CountryEnum.Mexico, new MexicoDelivery());
    }

    public static Factory instance(){
        if(instance == null) {
            instance = new Factory();
        }

        return instance;
    }

    public IDelivery get(CountryEnum country){
        IDelivery result = null;

        if(deliveryMap.containsKey(country)){
            result = deliveryMap.get(country);
        }

        return result;
    }

}
