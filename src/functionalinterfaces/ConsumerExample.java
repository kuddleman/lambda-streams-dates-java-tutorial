package functionalinterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = student -> System.out.println(student);

    //functional interface that will get name of student:
    static Consumer<Student> c3 = student -> System.out.print(student.getName());

    // functional interface that will print out activites:
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());


    public static void printStudents() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);

    }

    public static void printNameAndActivities() {
        // get list of students:
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c3.andThen(c4)); // consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        // get list of students:
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        })); // consumer chaining
    }





    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());

        //c1.accept("java8");
        //printName();

        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}
