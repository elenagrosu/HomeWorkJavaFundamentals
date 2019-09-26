package com.company;

import java.time.LocalDate;

public class Student  implements Comparable{
    private String name;
    private LocalDate dateOfBirth;
    private String details;

    public Student(String name, LocalDate dateOfBirth, String details) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        if (student.name.equals(this.name)  &&  student.dateOfBirth.equals(this.dateOfBirth)) {
            return true;
        }else {
            System.out.println(this);
            System.out.println(student);

            return false;
        }
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == this) {
            return 0;
        }
        if (obj != null && this!= null && obj.getClass() == this.getClass()) {

        Student student = (Student) obj;
        String a=this.getName();
        String b= student.getName();
        int compare = a.compareTo(b);
        if(compare<0) return  -1;
        else if (compare>0) return 1;
        else return 0;
        }
        return 0;
    }
}
