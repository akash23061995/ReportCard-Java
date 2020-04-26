package com.company;

public class ReportCard {

    private String name;
    private String rollNo;
    private String[] subjectNames = new String[6];
    private String[] subjectGrades = new String[6];

    public ReportCard(String namee,String roll,String subjectName[], String subjectGrade[]) {
        name=namee;
        rollNo=roll;
        for (int i = 0; i < 6; i++) {
            subjectNames[i] = subjectName[i];
            subjectGrades[i] = subjectGrade[i];
        }
    }

    public String getSubjectGrade(String subName) {
       String  subGrade = "Subject Not Found";
        for (int i = 0; i < 6; i++) {
            if (subName.equals(subjectNames[i]))
                subGrade = subjectGrades[i];

        }

        return subGrade;
    }

    public String[] getSubjectNames(){
        return subjectNames;
    }
    public String[] getSubjectGrades(){
        return subjectGrades;
    }

    public String getName(){
        return name;
    }
    public String getRollNo(){
        return rollNo;
    }

    public void setSubjectName(int position,String name){
        subjectNames[position]=name;
    }

    public void setSubjectGrade(int position,String grade){
        subjectGrades[position]=grade;
    }

    public  String toString(){
    return "Name: "+name+"\nRegistration Number: "+rollNo+"\n"+subjectNames[0]+": "+subjectGrades[0]+"\n"
            +subjectNames[1]+": "+subjectGrades[1]+"\n"+subjectNames[2]+": "+subjectGrades[2]+"\n"
            +subjectNames[3]+": "+subjectGrades[3]+"\n"+subjectNames[4]+": "+subjectGrades[4]+"\n"
            +subjectNames[5]+": "+subjectGrades[5]+"\n";
    }


}
