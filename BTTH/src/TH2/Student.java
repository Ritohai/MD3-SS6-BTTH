package TH2;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public String display() {
        return "Mã hs: " + studentId + ", Tên hs: " + studentName + ", Giới tính:" + (sex ? "Nam" : "Nữ") + ", Tên lớp:" + className + ", Tuổi: " + age + ", Địa chỉ: " + address;
    }

}
