package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();

//        ReportCard A= new ReportCard("Akash Soni","IPG-2014006", new String[]{"C Programming", "Data Structures",
//                "Algorithms", "Malware Analysis", "Artificial Intelligence","Computer Organization and Architehcture"},
//                new String[]{"D","C-","C-","B","C","D"});

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array that is to be created::");
//
//        int size = sc.nextInt();

        boolean i=true;
        while(i){
          System.out.println("Welcome to Student Report Card Management Software!!\nEnter number corresponding to your function:\n" +
                  "1.Generate a new Student Record\n2.Show a Student Record\n3.Show a Student Subjects" +
                  "\n4.Show a subject Grade\n5.Change a subject name\n6.Change a subject grade" +
                  "\n0.Exit"
          );
            Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        switch (s){

            case 0:
                i=false;
                break;
            case 1:
                String name,rollnumber;
                String[] subname= new String[6];
                String[] subgrades= new String[6];
                System.out.println("Enter Name of Student: ");
                Scanner sc1 = new Scanner(System.in);
                name = sc1.nextLine();
                System.out.println("Enter Roll No of Student: ");
                rollnumber = sc1.nextLine();
                System.out.println("Enter Subjects of Student: seperated by newline ");
                for(int ii=0;ii<6;ii++) {
                    subname[ii] = sc1.nextLine();
                }
                System.out.println("Enter Subject Grades of Student: seperated by newline ");
                for(int ii=0;ii<6;ii++) {
                    subgrades[ii] = sc1.nextLine();
                }
                ReportCard reportCard = new ReportCard(name,rollnumber,subname,subgrades);
                reportCards.add(reportCard);
                System.out.println("Record Created");
                break;
            case 2:
                System.out.println("Enter roll no of Student: ");
                Scanner sc12 = new Scanner(System.in);
                String roll = sc12.nextLine();
                boolean state=true;
                for(int j=0;j<reportCards.size();j++){
                    ReportCard r=reportCards.get(j);
                    if(r.getRollNo().equals(roll)) {
                        System.out.println(r.toString());
                       break;
                    }
                    else
                        state=false;
                }
                if(!state)
                    System.out.println("No record found");
               break;
            case 3:
                System.out.println("Enter roll no of Student: ");
                Scanner sc123 = new Scanner(System.in);
                String roll1 = sc123.nextLine();
                boolean state1=true;
                for(int j=0;j<reportCards.size();j++){
                    ReportCard r=reportCards.get(j);
                    if(r.getRollNo().equals(roll1)) {
                        String[] sub=r.getSubjectNames();
                        for(int t=0;t<sub.length;t++)
                            System.out.println(sub[t]);
                        break;
                    }
                    else
                        state1=false;
                }
                if(!state1)
                    System.out.println("No record found");
                break;
            case 4:
                System.out.println("Enter roll no of Student: ");
                Scanner sc1234 = new Scanner(System.in);
                String roll12 = sc1234.nextLine();
                boolean state123=true;
                for(int j=0;j<reportCards.size();j++){
                    ReportCard r=reportCards.get(j);
                    if(r.getRollNo().equals(roll12)) {
                        System.out.println("Enter the subject");
                        String subject = sc1234.nextLine();
                        String grade=r.getSubjectGrade(subject);
                        System.out.println(grade);
                        break;
                    }
                    else
                        state123=false;
                }
                if(!state123)
                    System.out.println("No record found");


                break;
            case 5:
                System.out.println("Enter roll no of Student: ");
                Scanner sc12345 = new Scanner(System.in);
                String roll123 = sc12345.nextLine();
                boolean state1234=true;
                for(int j=0;j<reportCards.size();j++){
                    ReportCard r=reportCards.get(j);
                    if(r.getRollNo().equals(roll123)) {
                        System.out.println("Enter the position and name of subject");
                        int pos=sc12345.nextInt();
                        String subject = sc12345.nextLine();
                        r.setSubjectName(pos,subject);
                        String[] subarr=r.getSubjectNames();
                       for (int k=0;k<subarr.length;k++)
                        System.out.println(subarr[k]);
                        break;
                    }
                    else
                        state1234=false;
                }
                if(!state1234)
                    System.out.println("No record found");



                break;
            case 6:
                System.out.println("Enter roll no of Student: ");
                Scanner sc123456 = new Scanner(System.in);
                String roll1234 = sc123456.nextLine();
                boolean state12345=true;
                for(int j=0;j<reportCards.size();j++){
                    ReportCard r=reportCards.get(j);
                    if(r.getRollNo().equals(roll1234)) {
                        System.out.println("Enter the position and grade of subject");
                        int pos=sc123456.nextInt();
                        String grade = sc123456.nextLine();
                        r.setSubjectGrade(pos,grade);
                        String[] subarr=r.getSubjectGrades();
                        for (int k=0;k<subarr.length;k++)
                            System.out.println(subarr[k]);
                        break;
                    }
                    else
                        state12345=false;
                }
                if(!state12345)
                    System.out.println("No record found");


                break;




        }



        }


    }
}
