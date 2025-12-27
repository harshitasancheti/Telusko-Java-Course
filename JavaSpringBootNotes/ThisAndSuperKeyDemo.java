class A{
    public A(){
        super();   // it is there because every class extends "Object" class
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class ThisAndSuperKeyDemo {
    public static void main(String[] args) {
        B obj = new B(5);
        // B obj = new B(5);

    }
}




// super() method is always there in every class. 
// We can't see it but it will be there that's why when we create an object of child class, it calls parent's class constructor as well. 
// This() method is used to call present class's constructor which means if we created an object of child's class then this() will call it's constructor as well.
// this() method will execute the constructor of the same class. 