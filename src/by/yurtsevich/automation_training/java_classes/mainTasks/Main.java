package by.yurtsevich.automation_training.java_classes.mainTasks;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Student[] stud = new Student[3];
        stud[0] = new Student(1, "Ivanov", "Aleksey", "Dmitrievich", new GregorianCalendar(1999, 1, 1), "Minsk", "353-33-44", "FMO", 2, 112);
        stud[1] = new Student(2, "Petrov", "Petr", "Petrovich", new GregorianCalendar(1998, 3, 2), "Minsk", "111-22-22", "FMO", 3, 122);
        stud[2] = new Student(3, "Sidorov", "Ivan", "Alekseevich", new GregorianCalendar(1997, 9, 1), "Minsk", "444-55-33", "FMO", 2, 331);

        List l = new List();

        for (Student k : stud) {
            l.addStudent(k);
        }
        System.out.println("список введенных студентов");
        l.listOut(stud);
        System.out.println("список студентов заданного факультета");
        l.listOutByFaculty("FMO");
        System.out.println("списки студентов для каждого факультета и курса");
        l.listOutByFacultyAndCourse("FMO", 2);
        System.out.println("список студентов, родившихся после заданного года");
        l.listOutByYear(new GregorianCalendar(1998, 2, 9));
        System.out.println("список учебной группы");
        l.listOutByGroup(331);
    }
}

