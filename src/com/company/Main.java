package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Student student1=new Student("Elena", LocalDate.of(2019,2,3),"TI-161");
        Student student2=new Student("Elena Grosu", LocalDate.of(2019,2,3),"TI-161");
        Student student3=new Student("Elena Gros", LocalDate.of(2019,2,3),"TI-161");
        Student student4=new Student("Elena Grosuu", LocalDate.of(2019,2,3),"TI-161");
        Student student5=new Student("Elena Grosuuuu", LocalDate.of(2019,2,3),"TI-161");
        Student student6=new Student("Ele ", LocalDate.of(2019,2,3),"TI-161");
        Student student7=new Student("ion",LocalDate.now(),"fadcd");
        int value;
        StudentTreeSet theTree=new StudentTreeSet();
        //System.out.println(theTree.isEmpty());

        /*System.out.println(theTree.add(student1));
        System.out.println(theTree.add(student2));
        System.out.println(theTree.add(student3));
        System.out.println(theTree.add(student4));
        System.out.println(theTree.add(student5));
        System.out.println(theTree.add(student6));
        System.out.println(theTree.add(student3));*/


        theTree.add(student1);
        theTree.add(student2);
        theTree.add(student3);
        theTree.add(student4);
        theTree.add(student5);
        theTree.add(student6);
        theTree.size();


        //System.out.println(theTree.size());
       // System.out.println(theTree.isEmpty());

       // System.out.println(theTree.contains(student4)+"   "+theTree.contains(student7));
        //System.out.println(theTree.toArray());
        while (theTree.iterator().hasNext()){
            Student node= theTree.iterator().next();
            System.out.print(node);
        }



    }
}
