package io.swagger.api;

import io.swagger.model.DataPartner;

import java.util.ArrayList;
import java.util.List;

public class Dummy {

    public static List<DataPartner> getDataPartners(){
        List<DataPartner> list = new ArrayList<>();

        DataPartner dataPartner = new DataPartner();
        dataPartner.setId("swiggy");
        dataPartner.setName("Swiggy Technologies");
        dataPartner.setType("services");

        list.add(dataPartner);

        DataPartner dataPartnerUber = new DataPartner();
        dataPartnerUber.setId("uber");
        dataPartnerUber.setName("Uber Technologies");
        dataPartnerUber.setType("services");

        list.add(dataPartnerUber);

        DataPartner dataPartnerOla = new DataPartner();
        dataPartnerOla.setId("ola");
        dataPartnerOla.setName("Ola Technologies");
        dataPartnerOla.setType("services");

        list.add(dataPartnerOla);
        return list;
    }

     public static DataPartner findPartnerById(String id){

         DataPartner dataPartner = new DataPartner();
        if("swiggy".equalsIgnoreCase(id)){
            dataPartner.setId("swiggy");
            dataPartner.setName("Swiggy Technologies");
            dataPartner.setType("services");
            return dataPartner;
        } else if("uber".equalsIgnoreCase(id)){
            dataPartner.setId("uber");
            dataPartner.setName("Uber Technologies");
            dataPartner.setType("services");
            return dataPartner;
         } else if("ola".equalsIgnoreCase(id)){
            dataPartner.setId("ola");
            dataPartner.setName("Ola Technologies");
            dataPartner.setType("services");
            return dataPartner;
        }

        return dataPartner;

     }
}
