package com.itformacion.java8;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Object2XML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance( MyObject.class );
        Marshaller m = jc.createMarshaller();
        m.marshal(new MyObject(), System.out);
    }
}