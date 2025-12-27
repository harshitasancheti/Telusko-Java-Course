class Student{
    int rollno;
    String name;
    int marks;
}
public class EnhancedForLoop{
    public static void main(String args[]){
        // int num[] = new int[4];
        // num[0] = 4;
        // num[1] = 5; 
        // num[2] = 6;
        // num[3] = 8;
        // for (int n:num){
        //     System.out.println(n);
        // }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Harshita";
        s1.marks = 96;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Karmanya";
        s2.marks = 69;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Shivani";
        s3.marks = 89;

        Student stu1[] = new Student[3];
        stu1[0] = s1;
        stu1[1] = s2;
        stu1[2] = s3;

        for(Student stud : stu1){
            System.out.println(stud.name + " : "+ stud.marks);
        }
    }
}