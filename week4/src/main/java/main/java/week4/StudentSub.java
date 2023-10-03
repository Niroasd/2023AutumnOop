package main.java.week4;

public class StudentSub extends Student {
    public StudentSub(String name, int id, double gpa, Major major) {
        super(name, id, gpa, major);
    }

    public String getString() {
        String reformattedString = String.format("Student details for ID: %d%n\tName: %s%n\tMajor: %s%n\tGPA: %s%n",
                this.getId(),
                this.getName(), this.getMajor(), this.getGpa());

        return reformattedString;
    }

    public static void main(String[] args) {
        StudentSub student1 = new StudentSub("Rotta Asdf", 1, 2.5, Major.COMPUTER_SCIENCE);
        StudentSub student2 = new StudentSub("Ok Mutta", 2, 4.0, Student.Major.MATHEMATICS);

        System.out.println(student1.getString());
        System.out.println(student2.getString());
    }
}
