package main;

class Grade {
    private String course;
    private int grade;

    public Grade(String course, int grade) {
        this.course = course;
        this.grade = grade;
    }
    
    public String toString() {
        return course + ": " + grade;
    }
}