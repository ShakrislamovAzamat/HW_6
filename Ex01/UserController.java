package Seminar_10.Ex01;

/*
Реализован принцип единой ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс для создания User
 */

public interface UserController<T extends User> {

    void create (String firstName, String lastName, String middleName);
}
