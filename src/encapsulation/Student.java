package encapsulation;

//This is the process of wrapping data and methods into a single unit and restricting access to the data.

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 70);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}

