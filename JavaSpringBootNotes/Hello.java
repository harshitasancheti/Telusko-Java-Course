public class Hello{
    public static void main(String[] args){
        // byte by = 129; -- this will also throw an error because of higher value given
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float marks = 6.5f;
        double d = 5.8;
        char c = 'k';
        boolean b = true;
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(marks);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

    }
}


// Data types
// 1. Integer - int-> 4 bytes -> (-2^31) to (2^31-1)
// 2. Long -> 8 bytes -> (-2^63) to (2^63-1)
// 3. short -> 2 bytes -> (-2^15) to (2^15-1)
// 4. byte -> 1 byte -> (-2^7) to (2^7-1) -> -128 to 127

// default float value for java is double that's why we need to give 
// 'f' after making a variable with float type. 
// for eg - float n = 6.5f otherwise it will throw an error.
// error - incompatible types: possible lossy conversion from double to float 

// Java supports UNICODE so we can use any type of characters here
// char c = 'k';

// boolean -> true or false
// boolean b = true;

