public class Loops {
    public static void main(String[] args) {
        
        // WHILE LOOP
        // int i=1;
        // while(i<=4){
        //     System.out.println("Hi " + i);
        //     int j=1;
        //     while (j<=3){
        //         System.out.println("Hello "+j);
        //         j++;
        //     }
        //     i++;
        // }
        
        // System.out.println("Bye "+i);

        

        // DO WHILE LOOP
        // int i=5;
        // do{
        //     System.out.println("Hi " +i);
        //     i++;
        // }
        // while (i<=4);


        // FOR LOOP

        // for(int i=1; i<=5; i++){
        //     System.out.println("Day " + i);
        //     for(int j=9; j<=17; j++){
        //         System.out.println(" "+ (j) + "-" + (j+1));
        //     }
        // }

        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

    }
}
