package com.example.android.reportcard;

/**
 * Created by Csaba on 13/05/2017.
 */

public class ReportCard {
    private int makeID;
    public String makestudentName;
    private String makesubject;
    private int makegrade;
    private String makedate;

    //method constructor
    public ReportCard(int ID, String StudentName, String Subject, int Grade, String Date) {
        makeID = ID;
        makestudentName = StudentName;
        makesubject = Subject;
        makegrade = Grade;
        makedate = Date;
    }

    //make get and set methods available for other activities
    public int getMakeID() {
        return makeID;
    }

    public String getMakestudentName() {
        return makestudentName;
    }

    public String getMakesubject() {
        return makesubject;
    }

    public int getMakegrade() {
        return makegrade;
    }

    public String getMakedate() {
        return makedate;
    }

    public void setMakeID(int ID) {
        makeID = ID;
    }

    public void setMakestudentName(String studedentName) {
        makestudentName = studedentName;
    }

    public void setMakesubject(String subject) {
        makesubject = subject;
    }

    public void setMakegrade(int grade) {
        makegrade = grade;
    }

    public void setMakedate(String date) {
        makedate = date;
    }

    @Override
    public String toString() {
        return "student ID number: " + makeID +
                "student name: " + makestudentName +
                "subject: " + makesubject +
                "grade: " + makegrade +
                "date: " + makedate;
    }
}



   
