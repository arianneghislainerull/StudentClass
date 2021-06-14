package com.company;

public class Main {

    public static void main(String[] args) {
	// Driver Class

        Student [] student = new Student[] {
                new Student (2434, "Arianne", "Rull"),
                new Undergraduate(33231, "John", "Doe", new double[] { 80, 79, 90, 78 }),
                new Undergraduate(342434, "Angela", "Cruz", new double[] { 89, 89, 90, 98, 100, 78, 90, 80, 79, 83, 98, 70, 90, 98, 97, 96, 99, 100, 90, 100 }),
                new Graduate(342344, "Henry", "Sartorious", new double[] { 90, 91, 92, 93, 89 }, "Thesis of a Graduate Student", 20),
                new Graduate(342344, "Jacob", "Sartorious", new double[] { 90, 98, 92, 96, 70 }, "Thesis of a Graduate Student" , 50),
                new Graduate(34324,"Bob", "Vand", new double[]{90, 91, 92, 93, 89 }, "Thesis#1", 35)
        };

        //foreach loop
        for(var person : student)
        {
            System.out.println(person);
        }

    }
}
