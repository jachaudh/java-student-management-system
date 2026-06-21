public class Grade {
    private int studentId;
    private String courseCode;
    private double grade;

    public Grade(int studentId, String courseCode, double grade) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                ", Course: " + courseCode +
                ", Grade: " + grade;
    }
}
