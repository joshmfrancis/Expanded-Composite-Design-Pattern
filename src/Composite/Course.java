/**
 * File: Course.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 04/22/2023
 * Java class description:
 */
// Package
package Composite;

////////////
// Import //
////////////
import java.util.ArrayList;

/**
 * Main class Instantiates the Course Object created in the Driver class
 *
 * @author josh
 */
public class Course {

    ///////////////////////////
    // Variables And Objects //
    ///////////////////////////
    
    // Private Global Variables
    private final String department;
    private final String number;
    private final String title;
    private final String spotsOpen;
    private final String creditHours;
    private final String referenceNumber;
    private final String beginDate;
    private final String endDate;
    private final String classTime;
    private final String days;
    private final String campus;
    private final String buildingAndRoom;
    private final String instructor;

    // Arraylist - Data Structure to hold preRequisites
    ArrayList<Course> preRequisites = new ArrayList<>();

    /////////////////
    // Constructor //
    /////////////////
    
    /**
     * Default Constructor - All relevant class information is passed through
     * from the driver class when an object is made.
     *
     * @param department
     * @param number
     * @param title
     * @param spotsOpen
     * @param creditHours
     * @param referenceNumber
     * @param beginDate
     * @param endDate
     * @param classTime
     * @param days
     * @param campus
     * @param buildingAndRoom
     * @param instructor
     */
    public Course(String department, String number, String title,
            String spotsOpen, String creditHours, String referenceNumber,
            String beginDate, String endDate, String classTime, String days,
            String campus, String buildingAndRoom, String instructor) {
        // Passed in from the partameters
        // Changes local variables from the method to global variables for the
        // class
        this.department = department;
        this.number = number;
        this.title = title;
        this.spotsOpen = spotsOpen;
        this.creditHours = creditHours;
        this.referenceNumber = referenceNumber;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.classTime = classTime;
        this.days = days;
        this.campus = campus;
        this.buildingAndRoom = buildingAndRoom;
        this.instructor = instructor;
    }

    /////////////
    // Methods //
    /////////////
    
    /**
     * Method to add preRequisites Adds the passed in course to the
     * preRequisites ArrayList
     *
     * @param course
     */
    public void addPreRequisite(Course course) {
        // Added to ArrayList
        this.preRequisites.add(course);
    }

    /**
     * Method to remove preRequisites Removes the passed in course from the
     * preRequisites ArrayList
     *
     * @param course
     */
    public void removePreRequisite(Course course) {
        // Removed from ArrayList
        this.preRequisites.remove(course);
    }

    /**
     * Method to get prerequisites gets getPreRequisites from the toString
     * method and ArrayList
     *
     * @return toPrint
     */
    public String getPreRequisites() {
        // variable to hold the department, number, and title of the course
        // when called
        String toPrint = this.toString() + "\n";

        // for loop to add to the toPrint String
        // for each course in the ArrayList...
        for (Course course : preRequisites) {
            // ...call the .getPreRequisites() to call the .toString() method
            // to add the course to the return statement of this method
            toPrint += course.getPreRequisites();
        }

        // returns the courses in a formatted String after the loop has run
        // through all of the courses in the ArrayList
        return toPrint;

    }

    /**
     * toString method to be called by the method getPreRequisites().
     *
     * @return this.department + " " + this.number + ": " + this.title + "   \t"
     *           + this.spotsOpen + "\t" + this.creditHours + "\t"
     *           + this.referenceNumber + "\t" + this.beginDate + "\t"
     *           + this.endDate + "\t" + this.classTime + "\t" + this.days + "\t"
     *           + this.campus + "\t" + this.buildingAndRoom + "\t"
     *           + this.instructor;
     */
    @Override
    public String toString() {
        return this.department + " " + this.number + ": " + this.title + "   \t"
                + this.spotsOpen + "\t" + this.creditHours + "\t"
                + this.referenceNumber + "\t" + this.beginDate + "\t"
                + this.endDate + "\t" + this.classTime + "\t" + this.days + "\t"
                + this.campus + "\t" + this.buildingAndRoom + "\t"
                + this.instructor;

    }

}
