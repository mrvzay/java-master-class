package dev.lpa;

import external.Child;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);
    }
}
