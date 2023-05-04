/**
 * File: CourseCatalogue.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 04/22/2023
 * Java class description: This class is the driver class for this project. This
 * class uses the helper class, "Course.java" for its methods. See Course.java
 * for more information. This class makes courses and calls the
 * .addPreRequisite(), .removePreRequisite() to add/remove them to the hierarchy
 * of needed prerequisites. Then, the program calls the .getPreRequisites()
 * method to get the needed prerequisites for the print statement. This project
 * is an example of The Composite Pattern Design.
 */
// Package
package Composite;

// Imports
import java.util.Scanner;

/**
 * Main class
 *
 * @author josh
 */
public class CourseCatalogue {

    /**
     * Main method to create the course objects, add them to the prerequisites,
     * and print them to the console.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner for the users input
        Scanner scan = new Scanner(System.in);

        // Creates new course objects with the parameters for relevent information
        Course CSC120 = new Course("CSC", "120", "Intro to Prog", "4", "3", "46805", "1/9/23", "5/6/23", "9:30 AM - 10:45 AM", "T-R", "LSUS", "TC211", "CHAKRABARTY, SUBHAJIT");
        Course CSC135 = new Course("CSC", "135", "Obj-Ori. Prog I", "7", "3", "46809", "1/9/23", "5/6/23", "12:30 PM - 1:45 PM", "T-R", "LSUS", "TC212", "CVEK, URSKA");
        Course CSC145 = new Course("CSC", "145", "Obj-Ori. Prog II", "24", "3", "46810", "1/9/23", "5/6/23", "12:30 PM - 1:45 PM", "T-R", "LSUS", "TC220", "WANG, ZHONGHUI");
        Course CSC242 = new Course("CSC", "242", "Comp Arch & Organiz", "21", "3", "46817", "1/9/23", "5/6/23", "2:00 PM - 3:15 PM", "T-R", "LSUS", "TC211", "ALAM, TAUHIDUL");
        Course CSC285 = new Course("CSC", "285", "Obj-Oriented Design", "11", "3", "46818", "1/9/23", "5/6/23", "3:30 PM - 4:45 PM", "M-W", "LSUS", "TC212", "ROGERS, LESLIE");
        Course CSC315 = new Course("CSC", "315", "Intro Database Sys", "11", "3", "46820", "1/9/23", "5/6/23", "3:30 PM - 4:45 PM", "T-R", "LSUS", "TC211", "ALAM, TAUHIDUL");
        Course CSC345 = new Course("CSC", "345", "Data Structures", "15", "3", "46821", "1/9/23", "5/6/23", "2:00 PM - 3:15 PM", "M-W", "LSUS", "TC220", "WATSON, RICHARD");
        Course MATH121 = new Course("MATH", "121", "College Algebra", "16", "3", "46479", "1/9/23", "5/6/23", "12:30 PM - 1:45 PM", "T-R", "LSUS", "BH442", "PATTERSON, STEPHAN");
        Course MATH201 = new Course("MATH", "201", "Discrete Math", "22", "3", "46533", "1/9/23", "5/6/23", "2:00 PM - 3:15 PM", "M-W", "LSUS", "BH463", "ILIOAEA, IRINA");
        
        // Adds the course (in the parameters) to the Course object
        // (dot operated on) as a prerequisite]
        CSC345.addPreRequisite(CSC285);
        CSC345.addPreRequisite(MATH201);
        CSC315.addPreRequisite(CSC145);
        CSC285.addPreRequisite(CSC145);
        CSC242.addPreRequisite(CSC135);
        CSC145.addPreRequisite(CSC135);
        CSC135.addPreRequisite(CSC120);
        CSC120.addPreRequisite(MATH121);
        
        // prints the CSC 345 prerequisites formatted from the
        // .getPreRequisites() method to the console
        // CSC 345 has prerequisites - CSC 285, Math 201, CSC 145, CSC 135, CSC 120, Math 121
        System.out.println("View: Student\n");
         System.out.println("--- Courses Needed to Take CSC 345 ---");
        System.out.println("Dept.#   Title                  Spots   Hours   Ref.#   Begin   End     Time                    Days    Campus  Room    Instructor");
        System.out.println(CSC345.getPreRequisites());

        // Remove functionality
        System.out.println("--- Removing MATH 121 as a prerequisite for CSC 120 ---");
        System.out.println("Dept.#   Title                  Spots   Hours   Ref.#   Begin   End     Time                    Days    Campus  Room    Instructor");
        CSC120.removePreRequisite(MATH121);
        System.out.println(CSC345.getPreRequisites());

    }

}
