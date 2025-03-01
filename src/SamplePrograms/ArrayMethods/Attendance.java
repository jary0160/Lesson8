package SamplePrograms.ArrayMethods;

import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        String attendance[][] = {
            {"JOE", "s09", "s12", "o14"},
            {"BOB", "o13"},
            {"SUE", "s24", "o12"},
            {"AMY", "s05", "s23", "011", "023", "n12", "n23"}
        };
        //print out
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(j == 0 ? attendance[i][j] + " - ABBSENT DAYS: "
                        : attendance[i][j] + " | ");
            }
            System.out.println("\n------------------------------");
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String nm = s.next();
        String results[] = getDates(nm, attendance);
        if (results.length == 0) {
            System.out.println("Student not found");
        } else {
            System.out.println(nm + " has had " + results.length + " absences: ");
            for (int i = 0; i < results.length; i++) {
                System.out.print(results[i] + ", ");

            }
        }

    }

    public static String getDates(String nm, String att[][]) {
        String dates = ""; //split this into an array
        for (int i = 0; i < att.length; i++) {
            if (nm.equals(att[i][0])) {
                for (int j = 1; j < att[i].length; j++) {
                    //add all dates to string
                    dates += att[i][j];
                }

            }
        }
        if (dates.length() == 0) {
            return new String[0];
        }

    }

}
