public class StudentList {
    String student;
    int id;
    int age;
    public StudentList(int id, String student, int age){
        this.id = id;
        this.student = student;
        this.age = age;
    }
    public StudentList(){

    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "student='" + student + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
