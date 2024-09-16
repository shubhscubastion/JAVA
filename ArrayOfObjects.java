class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student prashant = new Student();
        prashant.rollno = 1;
        prashant.name = "Prashant";
        prashant.marks = 10;

        Student shubh = new Student();
        shubh.rollno = 2;
        shubh.name = "Shubh Sarpal";
        shubh.marks = 88;

        Student shivam = new Student();
        shivam.rollno = 2;
        shivam.name = "Shivam";
        shivam.marks = 80;

        Student students[] = new Student[3];

        students[0] = prashant;
        students[1] = shubh;
        students[2] = shivam;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks + " : " + student.rollno);
        }
    }

}
