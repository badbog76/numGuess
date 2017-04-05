import java.util.*;
public class numGuess {
    public static void main(String[] args) {
        int x,y;
        y=generate(10);
        boolean nimerit=false;
        int optiune;
       do {
           System.out.println("1->Jucati\n0->Iesiti");
           optiune=new Scanner(System.in).nextInt();
           while (!nimerit) {
               System.out.print("X:");
               x = new Scanner(System.in).nextInt();
               if (x == y) {
                   nimerit = true;
                   System.out.println("bv");
               } else if (x < y) {
                   System.out.println("incercati un nr mai mare");
               } else

                   System.out.println("incercati un nr mai mic");

           }
       }
           while (optiune!=0);
       }


    public static int generate(int maximumAllowed) {
        return Math.abs(new java.util.Random().nextInt() % maximumAllowed) + 1;
    }


}
