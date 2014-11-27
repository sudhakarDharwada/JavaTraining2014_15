package com.vl.training.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MarksAssessment {
    static Student[] student;
    static int n;

    public static void main(String arr[]) throws FileNotFoundException {
        //Enter the no. of Students
        Scanner sc = new Scanner(new File("../data.txt")); 
        n = sc.nextInt();
        student = new Student[n];

        int maxMarks=0;
        String maxStudent="";
        for (int i = 0; i < n; i++) {
            student[i] = Student.readMe(sc);
            int temp = student[i].getTotal();
            if (maxMarks < temp) { 
                maxMarks = temp;
                maxStudent = student[i].getName();
            }
        }   
        System.out.println("Maximum marks are scored by "+maxStudent+" with marks: "+maxMarks);
    }
}

class Student {
    String name;
    int total;
    static Student student;
    static Subject[] subject;
 
    static Student readMe(Scanner sc) {

        student = new Student();
        //Reading the name
        student.name = sc.next();
        //Reading the no. of subjects
        int n = sc.nextInt();
        student.subject = new Subject[n];
        for (int i=0; i < n; i++)
              subject[i] = Subject.readMe(sc); 
        return student;
    }
    
    int getTotal() {
        for (Subject i : subject)
             total += i.getMarks();
        return total;
    }

    String getName() {
        return name;
    }
}

class Subject {
    String name;
    int marks;
    static Subject subject;

    static Subject readMe(Scanner sc) {
        subject = new Subject();
        subject.name = sc.next();
        subject.marks = sc.nextInt();
     return subject;
    }
    
    String getSubjectName() {
        return name;
    }

    int getMarks() {
        return marks;
    }
}
