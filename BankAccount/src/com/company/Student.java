package com.company;

//super class
public class Student {

    public int StudentID;
    public String FirstName;
    public String LastName;

    public Student(int StudentID, String FirstName, String LastName){
        this.StudentID = StudentID; // assigns the value of the parameter a to the field of the same name
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    @Override
    public String toString(){
        return String.format("Student ID: "+StudentID+", First Name: "+FirstName+", Last Name: "+ LastName);
    }

}
