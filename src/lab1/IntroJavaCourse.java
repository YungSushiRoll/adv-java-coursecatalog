package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double courseCredits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCourseCredits(courseCredits);
        this.setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

}
