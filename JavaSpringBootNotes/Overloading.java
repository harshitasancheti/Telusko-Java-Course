class Calculator{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(18,15);
        int r2 = obj.add(69,96,69);
        double r3 = obj.add(18.69,15);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }   
}
