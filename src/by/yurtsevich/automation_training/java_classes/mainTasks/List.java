package by.yurtsevich.automation_training.java_classes.mainTasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class List {

    private Student[] studentlist = new Student[100];

    int k = 0;

    public void addStudent(Student n) {

        studentlist[k++] = n;

    }

    public void listOut(Student[] studentlist) {

        for (Student m : studentlist) {

            System.out.print("id: " + m.getId() + ", ");
            System.out.print("name: " + m.getName() + ", ");
            System.out.print("patronymic: " + m.getPatronymic() + ", ");
            System.out.print("surname: " + m.getSurname() + ", ");
            System.out.print("id: " + m.getId() + ", ");
            System.out.print("birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                    + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
            System.out.print("adress: " + m.getAddress() + ", ");
            System.out.print("phone: " + m.getPhone() + ", ");
            System.out.print("faculty: " + m.getFaculty() + ", ");
            System.out.print("course number: " + m.getCourseNumber() + ", ");
            System.out.print("group number: " + m.getGroupNumber() + ", ");
            System.out.println();
        }

    }

    public void listOutByFaculty(String faculty) {

        for (Student m : studentlist) {
            if(m != null) {

                if (faculty.equalsIgnoreCase(m.getFaculty())) {

                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("name: " + m.getName() + ", ");
                    System.out.print("patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("surname: " + m.getSurname() + ", ");
                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                            + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + m.getAddress() + ", ");
                    System.out.print("phone: " + m.getPhone() + ", ");
                    System.out.print("faculty: " + m.getFaculty() + ", ");
                    System.out.print("course number: " + m.getCourseNumber() + ", ");
                    System.out.print("group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }

        }

    }

    //b) списки студентов для каждого факультета и курса;

    public void listOutByFacultyAndCourse(String Faculty, int course) {

        for (Student m : studentlist) {
            if (m != null) {
                if (m.getFaculty().equalsIgnoreCase(Faculty) && m.getCourseNumber() == course) {

                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("name: " + m.getName() + ", ");
                    System.out.print("patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("surname: " + m.getSurname() + ", ");
                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("birthdate: " + m.getBirthdate().get(Calendar.YEAR) + "-" + m.getBirthdate().get(Calendar.MONTH)
                            + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + m.getAddress() + ", ");
                    System.out.print("phone: " + m.getPhone() + ", ");
                    System.out.print("faculty: " + m.getFaculty() + ", ");
                    System.out.print("course number: " + m.getCourseNumber() + ", ");
                    System.out.print("group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }
    //c) список студентов, родившихся после заданного года;
    public void listOutByYear(GregorianCalendar year) {

        for (Student m : studentlist) {
            if(m != null) {
                if (m.getBirthdate().get(Calendar.YEAR)>year.get(Calendar.YEAR)) {

                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("name: " + m.getName() + ", ");
                    System.out.print("patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("surname: " + m.getSurname() + ", ");
                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                            + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + m.getAddress() + ", ");
                    System.out.print("phone: " + m.getPhone() + ", ");
                    System.out.print("faculty: " + m.getFaculty() + ", ");
                    System.out.print("course number: " + m.getCourseNumber() + ", ");
                    System.out.print("group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }

    }
    public void listOutByGroup(int groupe) {

        for (Student m : studentlist) {
            if (m != null) {
                if (m.getGroupNumber() == groupe) {

                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("name: " + m.getName() + ", ");
                    System.out.print("patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("surname: " + m.getSurname() + ", ");
                    System.out.print("id: " + m.getId() + ", ");
                    System.out.print("birthdate: " + m.getBirthdate().get(Calendar.YEAR) + "-" + m.getBirthdate().get(Calendar.MONTH)
                            + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + m.getAddress() + ", ");
                    System.out.print("phone: " + m.getPhone() + ", ");
                    System.out.print("faculty: " + m.getFaculty() + ", ");
                    System.out.print("course number: " + m.getCourseNumber() + ", ");
                    System.out.print("group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }

}