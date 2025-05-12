package com.dhanunjay.arrays;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        DynamicArray<Student> students = new DynamicArray<>();

        // Adding students
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));

        System.out.println("After adding 3 students:");
        System.out.println(students);  // [Student{id=1, name='Alice'}, ...]

        // Inserting a student at index 1
        students.add(1, new Student(4, "David"));
        System.out.println("\nAfter inserting David at index 1:");
        System.out.println(students);

        // Getting a student
        Student s = students.get(2);
        System.out.println("\nStudent at index 2: " + s);

        // Removing student at index 0
        students.remove(0);
        System.out.println("\nAfter removing student at index 0:");
        System.out.println(students);

        // Checking size
        System.out.println("\nCurrent size: " + students.size());

        // Checking if empty
        System.out.println("Is empty? " + students.isEmpty());
    }
}

