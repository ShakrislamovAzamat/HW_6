package Seminar_10.Ex01;

/*
Реализован принцип открытости/закрытости и принцип Лисков
Осуществлен родительский класс с описанием функционала для работы с ним.
 */

public class User {
    private String firstName;
    private String lastname;
    private String middleName;


    public User(String firstName, String lastname, String middleName) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.middleName = middleName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
}
