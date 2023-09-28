package main.java.week4;

public class Student {
    public enum Major {
        COMPUTER_SCIENCE,
        MATHEMATICS,
        LITERATURE,
        PHYSICS,
        HISTORY
    };

    private String name;
    private int id;
    private double gpa;
    private Major major;

    // getterit ja setterit

    public Major getMajor() {
        return this.major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return this.gpa;
    }

    // tarkistetaan 0 < gpa < 4
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
    }

    // Constructorit,
    // eka ilman gpa ja major sit niitten kanssa.

    public Student(String name, int id) {
        setName(name);
        setId(id);
        this.major = null;
        this.gpa = 0.0;
    }

    public Student(String name, int id, double gpa, Major major) {
        setName(name);
        setId(id);
        setMajor(major);
        setGpa(gpa);
    }
}
