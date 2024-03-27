package dev.lpa;

public class Parent {

    private final String name;
    private final String dob;

    {
        name = "John Doe";
        dob = "01/01/1900";
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +", dob='" + dob + '\'';
    }
}
