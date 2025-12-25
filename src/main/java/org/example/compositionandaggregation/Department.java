package org.example.compositionandaggregation;
public class Department {
    private final String id;
    private final String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
