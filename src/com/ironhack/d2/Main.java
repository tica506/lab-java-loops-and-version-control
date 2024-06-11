package com.ironhack.d2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("week 1 day 2 lesson");
        //ARRAY
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday"};
    System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[3]);
        System.out.println(days[days.length - 1]);

        String[] subjects = new String [5];
        subjects[1] = "Math";
        subjects[2] = "Language";
        subjects[3] = "histoy";
        subjects[4] = "Chemistry";

        String[] SubjectArray = createSubjectArray();

    System.out.println(Arrays.toString(subjects));

    }



    public static String[] createSubjectArray() {
        String[] subjects = new String [5];
        subjects[1] = "Math";
        subjects[2] = "Language";
        subjects[3] = "histoy";
        subjects[4] = "Chemistry";

        return subjects;
    }
}
