package Seminar_10.Ex01;

/*
Реализован принцип разделения интерфейса
Создан интерфейс только для сортировки списка User и наследуемых классов
 */

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastname().compareTo(o2.getLastname());
            if (resultOfComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }

}
