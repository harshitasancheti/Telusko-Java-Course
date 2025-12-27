public class StringDemo {
    public static void main(String[] args) {
        // String name = new String("Harshita");
        // System.out.println(name);
        // System.out.println(name.hashCode());
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Sancheti"));

        // Strings are immutable by default. If we need mutable string in java then we will use String buffer and String builder.

        // String name = "Harshita";
        // name = name + " Sancheti";
        // System.out.println("Hello " + name);
        

        // String n1 = "Harshita";
        // String n2 = "Harshita";
        // System.out.println(n1==n2);


        // String Buffer Demo

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Harshita");
        System.out.println(sb1.capacity());

        System.out.println(sb.length());
        System.out.println(sb1.length());

        sb1.append(" Sancheti");

        System.out.println(sb1);

        // toString method will convert string buffer object to string.

        // sb1.deleteCharAt(2);

        sb1.insert(0, "Java ");

        System.out.println(sb1);

        // String buffer is thread safe bu string builder is not. 

    }
}
