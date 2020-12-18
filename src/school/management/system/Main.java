package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher carol = new Teacher(1, "Carol", 40000);
        Teacher jim = new Teacher(2, "Jim", 60000);
        Teacher tony = new Teacher(3, "Tony", 65000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(carol);
        teacherList.add(jim);
        teacherList.add(tony);

        Student jess = new Student(1, "Jess", 4);
        Student vanessa = new Student(2, "Vanessa", 6);
        Student lenny = new Student(3, "Lenny", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jess);
        studentList.add(vanessa);
        studentList.add(lenny);

        School sbd = new School(teacherList, studentList);


        jess.payFees(5000);
        vanessa.payFees(1000);
        vanessa.payFees(10000);
        jess.payFees(20000);
        lenny.payFees(20000);
        lenny.payFees(5000);
        lenny.payFees(40000);
        System.out.println("This school has earned $" + sbd.getTotalMoneyEarned());

        System.out.println("--Paying Out Salaries--");
        carol.recieveSalary(carol.getSalary());
        System.out.println("The school has paid out " + carol.getName() + " salary of $" + carol.getSalary() +  " and now has $" + sbd.getTotalMoneyEarned());


        tony.recieveSalary(tony.getSalary());
        System.out.println("The school has paid out " + tony.getName() + " salary of $" + tony.getSalary() + " and now has $" + sbd.getTotalMoneyEarned());

        System.out.println(jess);
        System.out.println(vanessa);
        System.out.println(lenny);

        System.out.println(carol);
        System.out.println(tony);
        System.out.println(jim);
    }
}
