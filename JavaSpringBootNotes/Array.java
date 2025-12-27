class Student{
    int rollno;
    String name;
    int marks;
}
public class Array {
    public static void main(String[] args) {
        // single-dimensional array

        // int n[] = new int[4];
        // n[0] = 6;
        // n[1] = 8;
        // n[2] = 10;
        // n[3] = 12;
        // for (int i=0; i<4; i++){
        //     System.out.println(n[i]);
        // }

        // Multi-dimensional array
        
        // int n[][] = new int[3][4];

        // for(int i=0;i<3;i++){
        //     for (int j=0;j<4;j++){
        //         n[i][j] = (int)(Math.random()*100);
        //     }
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(n[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // // Enhanced for loop 

        // for (int num[] : n){
        //     for (int m:num){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }


        // Jagged and 3D array
        // int nums2[][] = new int[3][]; // jagged
        // nums2[0] = new int[3];
        // nums2[1] = new int[4];
        // nums2[2] = new int[2];

        // for (int i=0;i<nums2.length;i++){
        //     for(int j=0;j<nums2[i].length;j++){
        //         nums2[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for (int num1[] : nums2){
        //     for (int m:num1){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }


        // Array of objects:

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
        
        Student s4 = new Student();
        s4.rollno=123;
        s4.name="Dimple";
        s4.marks=90; 
        
        Student stu1[] = new Student[4];
        stu1[0] = s1;
        stu1[1] = s2;
        stu1[2] = s3;
        stu1[3]= s4;

        

        for (int i=0; i<stu1.length;i++){
            System.out.println(stu1[i].name+ ": " +stu1[i].marks);
        }

        // List<Integer> ls = new Arr

    }
}
