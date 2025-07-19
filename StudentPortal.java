public class StudentPortal 
{
    public static void main(String[] args) {
        // Object creation (heap)
        Student s1 = new Student(9, "Nijal Bhanderi");
        Student s2 = new Student(76, "Darshan Patel");

        // Method calls (stack)
        s1.enrollCourse("Java Programming", 4);
        s1.enrollCourse("Data Structures", 3);
        s1.enrollCourse("DBMS", 3);

        s2.enrollCourse("Maths", 4);
        s2.enrollCourse("Physics", 3);

        // Display data
        System.out.println(s1);
        s1.showCourses();
        s1.enrollSemesterCourses();

        System.out.println("================================================================");

        System.out.println(s2);
        s2.showCourses();
        s2.enrollSemesterCourses();

        // equals() and hashCode() usage
        System.out.println("\nComparing students:");
        System.out.println("Are s1 and s2 same? " + s1.equals(s2));
    }
}