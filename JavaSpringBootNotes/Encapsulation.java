class Human{
    private int age;   //age = instance variable
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int a){   // a = local variable
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
       Human obj = new Human();
       obj.setAge(25);
       obj.setName("Harshita");
       System.out.println(obj.getName() + " : " + obj.getAge()); 
    }
}
