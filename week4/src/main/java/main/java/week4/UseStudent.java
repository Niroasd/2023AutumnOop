package main.java.week4;

public class UseStudent {

    public static void main(String[] args) {
        Student mikael = new Student("Mikael Kosola", 22);
        Student abbaba = new Student("Matti Meikäläinen", 1992, 4.0, Student.Major.COMPUTER_SCIENCE);
        printStudentData(mikael);
        printStudentData(abbaba);
    }

    public static void printStudentData(Student student) {
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getMajor());
        System.out.println(student.getGpa());
    }
}
