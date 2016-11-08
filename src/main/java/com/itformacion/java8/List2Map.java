package com.itformacion.java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2Map {
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", new Date()));
        list.add(new Hosting(2, "linode.com", new Date()));
        list.add(new Hosting(3, "digitalocean.com", new Date()));

        Map<Integer, String> result = list.stream().collect(
            Collectors.toMap(Hosting::getId, Hosting::getName)
        );

        System.out.println("Result: " + result);
    }
}