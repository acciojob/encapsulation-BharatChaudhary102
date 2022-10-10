package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly ob = new RWOnly();

//        ob.name = "Private var";
//        System.out.println(ob.name);
        // Error: :8:11 java: name has private access in com.driver.RWOnly

        ob.setter(123);
        System.out.println(ob.getter());
    }
}