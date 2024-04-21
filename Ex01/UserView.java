package Seminar_10.Ex01;

/*
Реализован принцип единой ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс c методом просмотра User и наследников
 */

import java.util.List;

public interface UserView<T extends User> {

    void sendOnConsole (List<T> list);
}
