package com.itformacion.java8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyObject {
    private int age = 22;
    private String firstname = "Michael";

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }
}