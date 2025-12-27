public class TypeConv {
    public static void main(String args[]){
        // byte b = 127;
        // int a = 257;
        // byte k = (byte) a;
        // System.out.println(k);

        // float f = 5.6f;
        // int t = (int) f;
        // System.out.println(t);

        // byte a = 10;
        // byte b = 30;
        // int res = a*b;
        // System.out.println(res); 

        // this is called type promotion because the result 
        // we got is more than range of byte so it will 
        // automatically convert it into integer value and give us 300.


        char ch ='a';
        char res = (char)(ch+1);
        System.out.println(res);
        System.err.println("H");
    }

}


// Type conversion
// when we try to type cast int value to byte value then it 
// will give the ans by doing modulu operation.
// For eg - when we convert int a into byte k and give 257 in a
// then it will give 275/256 = 1 in k 


// WE can represent long literals in Java in following ways:
// 1. 123L 2. 123l 3. 0b1010L

// Invalid way to declare character variable in Java is 
// - char c = "a";

// default value assigned to boolean type in Java is FALSE.

// High-order bit represents 'sign of the integer' for an integer.

