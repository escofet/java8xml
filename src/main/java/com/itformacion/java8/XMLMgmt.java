package com.itformacion.java8;

import com.thoughtworks.xstream.XStream;

public class XMLMgmt {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        // XStream xstream = new XStream(new StaxDriver()); Since Java 6
        xstream.alias("person", Person.class);
        xstream.alias("phonenumber", PhoneNumber.class);
        Person joe = new Person("Joe", "Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));
        String xml = xstream.toXML(joe);
        System.out.println(xml); // to XML
        
        Person newJoe = (Person)xstream.fromXML(xml); // from XML to object
        System.out.println(newJoe);
    }
}