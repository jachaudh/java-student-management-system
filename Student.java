public class Student {
    private int studentId;
    private String name;
    private String program;

    public Student(int studentId, String name, String program) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                ", Name: " + name +
                ", Program: " + program;
    }
}
