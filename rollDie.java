import java.util.Scanner;

class rollDie {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int dieroll = 0;
        int total   = 0;
        int numdice = 0;
        int sides   = 0;
        String ans  = "y";
        while (ans.equals("y")) {
            System.out.print("roll how many dice? ");
            numdice = sc.nextInt();
            System.out.println("how many sides? ");
            sides = sc.nextInt(); 
            System.out.println("");
            System.out.print("you rolled: ");
            total = 0;
            for (int i = 0; i > numdice; i++) {
                dieroll = rollDie(sides);
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }
            System.out.println("");
            System.out.println("total:" + total);
            System.out.print("");
            System.out.print("go again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
    public static int rollDie(int s) {
        return (int) Math.random()*s+1;
    }
}