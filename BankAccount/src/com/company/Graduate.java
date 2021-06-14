package com.company;
//subclass
public class Graduate extends Student {
    public double[] Grades;
    public String Thesis;
    public double WeeklyHours;

    public Graduate(int StudentID, String FirstName, String LastName, double[] Grades, String Thesis, double WeeklyHours) {
        super(StudentID, FirstName, LastName); // assigns the value of the parameter a to the field of the same name
        this.Grades = Grades;
        this.Thesis = Thesis;
        this.WeeklyHours = WeeklyHours;
    }

    @Override
    public String toString(){
        double sum = 0;

        //for each loop for adding the total sum of the grades
        for (double grade : Grades){
            sum+= grade;
        }

        // for each loop for checking the number of achieved credits to graduate
        double achievedCredits = 0;
        for (double grade : Grades){
            if (grade >= 70)
                achievedCredits = achievedCredits + 1.0;
        }

        Boolean Graduate;
        if (achievedCredits >= 5)
            Graduate = true;
        else
            Graduate = false;

        return String.format("Student ID: "+StudentID+", First Name: "+FirstName+", Last Name: "+
                LastName+", Number of Teaching Hours: "+WeeklyHours+", Thesis: "+ Thesis +
                ", Average: " + (sum/Grades.length) +
                ", \n\tEligible to Graduate: " + Graduate+ "\n\t");
    }

}
