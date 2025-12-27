class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,8);
        int r2 = obj.sub(85,58);
        int r3 = obj.multi(9, 8);
        int r4 = obj.div(19, 6);
        double r5 = obj.power(4, 3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
