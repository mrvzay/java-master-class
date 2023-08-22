package dev.lpa;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitsStrings = "Hello World again".split(" ");
        printText(splitsStrings);

        System.out.println("_".repeat(30));
        printText("Hello");

        System.out.println("_".repeat(30));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(30));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
