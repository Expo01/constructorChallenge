package com.company;

public class Main {

    public static void main(String[] args) {

        Customer one = new Customer();
        System.out.println(one.getName());
        System.out.println(one.getEmail());
        System.out.println(one.getCreditLimit());
        System.out.println("");

        Customer two = new Customer("tom", "tom.com");
        System.out.println(two.getName());
        System.out.println(two.getEmail());
        System.out.println(two.getCreditLimit());
        System.out.println("");

        Customer three = new Customer("adam", "adam.com", 500);
        System.out.println(three.getName());
        System.out.println(three.getEmail());
        System.out.println(three.getCreditLimit());
    }
}
