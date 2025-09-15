public class Conditional {
    public static void main(String[] args) {
        
        // int x=8;

        // if(x>10 && x<=20){
        //     System.out.println("Hello");
        // }
        // else{
        //     System.out.println("Bye");
        // }


        // char ch ='a';
        // char res = (char)(ch+1);

        // int score = 99;
        // char grade = 'B';
        // if(score >= 90)
        //     System.out.println((char)(grade-1));


        // Ternary operator

        // int n = 18;
        // int res;

        // res = n%2==0 ? 10 : 20;

        // System.out.println(res);


        //Switch case
        
        int n = 10;

        switch (n) {
            case 1:
                System.out.println("Monday");   
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Value not in our switch case");
                break;
        }

    }
}
