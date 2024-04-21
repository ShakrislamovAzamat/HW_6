package Seminar_10.Ex01;

/*
Реализован принцип открытости/закрытости и принцип Лисков.
Наследуется родительский класс User, тем самым наследуются и его функции и методы
 */

public class Student extends User implements Comparable<Student> {

    public Student(String firstName, String lastname, String middleName) {
        super(firstName, lastname, middleName);
    }

    private Long studentId;

    public Long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

}
