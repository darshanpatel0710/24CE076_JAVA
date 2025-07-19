import java.util.*;

public class Student {
    private int id;
    private String name;
    private String enrolledCourses;

    public Student(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    // Inner class: Course
    public class Course 
    {
        private String courseName;
        private int credits;

        public Course(String courseName, int credits) {
            this.courseName = courseName;
            this.credits = credits;
        }

        public String getCourseName() {
            return courseName;
        }

        public int getCredits() {
            return credits;
        }

        public String toString() {
            return courseName + " (" + credits + " credits)";
        }
    }

    // Method to enroll course
    public void enrollCourse(String courseName, int credits) 
    {
        Course c = new Course(courseName, credits);
    }

    // Method to show all courses
    public void showCourses() {
        System.out.println("Courses for " + name + ":");
    }

    // Method-local inner class for semester enrollment
    public void enrollSemesterCourses() {
        class SemesterCourse 
        {
            String semesterName;

            SemesterCourse(String semesterName) {
                this.semesterName = semesterName;
            }

            void show() {
                System.out.println("Enrolled in: " + semesterName + " semester");
            }
        }

        SemesterCourse sc = new SemesterCourse("Jan 2025");
        sc.show();
    }


    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Override toString
    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}