package Seminar_10.Ex01;

/*
Реализован принцип единой ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс. Класс предоставляет только возможность вывода
в консоль списка студентов.
 */

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
       for (Student student : list){
        System.out.println(student.getStudentId());
       }
    }

}
