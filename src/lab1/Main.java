package lab1;

public class Main {
    public static void main(String[] args) {

        Course newAdvJavaCourse = new AdvancedJavaCourse("adv_java","201",4, "intro_java");
        // declaring using abstract type vs using class type
        AdvancedJavaCourse anotherAdvJavaCourse = new AdvancedJavaCourse("adv_java","SO12345",4, "intro_java");
        Course newIntroJavaCourse = new IntroJavaCourse("intro_java","101",3,"intro_programming");
        Course newIntroToProgrammingCourse = new IntroToProgrammingCourse("intro_programming","100",3);

        System.out.println("Course Name: " + newAdvJavaCourse.getCourseName() + "\nCourse Number: " + newAdvJavaCourse.getCourseNumber() + "\nCredits: " + newAdvJavaCourse.getCourseCredits() + "\n"/*+ "\n" +  newAdvJavaCourse.getPrerequisites()*/);
        System.out.println("Course Name: " + anotherAdvJavaCourse.getCourseName() + "\nCourse Number: " + anotherAdvJavaCourse.getCourseNumber() + "\nCredits: " + anotherAdvJavaCourse.getCourseCredits() + "\nPrereqs: " + anotherAdvJavaCourse.getPrerequisites() + "\n");
        // declaring using the abstract type only allows you to use methods from the abstract class EX: you cannot get
        // the courses prerequisites unless you are declaring from the specific class - this is a con to using abstract classes
        // pro to using abstract classes is that you can define multiple common methods that can be used by other classes
        System.out.println("Course Name: " + newIntroJavaCourse.getCourseName() + "\nCourse Number: " + newIntroJavaCourse.getCourseNumber() + "\nCredits: " + newIntroJavaCourse.getCourseCredits() + "\n");
        System.out.println("Course Name: " + newIntroToProgrammingCourse.getCourseName() + "\nCourse Number: " + newIntroToProgrammingCourse.getCourseNumber() + "\nCredits: " + newIntroToProgrammingCourse.getCourseCredits() + "\n");


    }
}
