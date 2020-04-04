package lab2;

public class Main {
    public static void main(String[] args) {

        IntroToProgrammingCourse newIntroToProgramming = new IntroToProgrammingCourse("intro_programming","100",3);
        IntroJavaCourse newIntroJava = new IntroJavaCourse("intro_java","200",3,"intro_programming");
        // checking differences in declarations
        Course anotherIntroJava = new IntroJavaCourse("intro_java","201",3,"intro_programming");
        Prerequisite anothaIntroJava = new IntroJavaCourse("intro_java","202",3,"intro_programming");
        // end checking
        AdvancedJavaCourse newAdvJavaCourse = new AdvancedJavaCourse("adv_java","300",4,newIntroJava.getCourseName() /*just wanted to see if this worked.. it did*/ );

        System.out.println("Course Name: " + newIntroToProgramming.getCourseName() + "\nCourse Number: " + newIntroToProgramming.getCourseNumber() + "\nCredits: " + newIntroToProgramming.getCourseCredits() + "\n");
        System.out.println("Course Name: " + newIntroJava.getCourseName() + "\nCourse Number: " + newIntroJava.getCourseNumber() + "\nCredits: " + newIntroJava.getCourseCredits() + "\nPrereqs: " + newIntroJava.getPrerequisites() + "\n");
       // System.out.println("Course Name: " + anotherIntroJava.getCourseName() + "\nCourse Number: " + anotherIntroJava.getCourseNumber() + "\nCredits: " + anotherIntroJava.getCourseCredits() + "\nPrereqs: " + anotherIntroJava.getPrerequisites());
       // System.out.println("Course Name: " + anothaIntroJava.getCourseName() + "\nCourse Number: " + anothaIntroJava.getCourseNumber() + "\nCredits: " + anothaIntroJava.getCourseCredits() + "\nPrereqs: " + anothaIntroJava.getPrerequisites());
        System.out.println("Course Name: " + newAdvJavaCourse.getCourseName() + "\nCourse Number: " + newAdvJavaCourse.getCourseNumber() + "\nCredits: " + newAdvJavaCourse.getCourseCredits() + "\nPrereqs: " + newAdvJavaCourse.getPrerequisites() + "\n");

        // the difference in interface declarations is that you're only able to refer to the methods that are in that interface although you can still create a course based off that specific interface - con
        // you would be better off declaring it in its own class and be able to refer back to the specific interfaces when you want to.
        // another con is that you have to do a lot of repeated code in each class since you cannot instantiate in the interfaces themselves.

    }
}
