package Seminar_10.Ex01;

/*
Реализован принцип единой ответственности и принцип разделения интерфейсов.
Осуществлен только один интерфейс итератора. Класс описывает группу студентов
и осуществляет необходимый функционал только для работы с группой
 */

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentList.add(new Student(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

}
