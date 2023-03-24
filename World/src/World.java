import java.util.Scanner;
import java.util.Random;
public class World {
    public static void main(String[] args) {
        Scanner mutq = new Scanner(System.in);
        Random ra = new Random();
        int x = mutq.nextInt();
        int y = (int) (100 * ra.nextDouble());
        try {


            System.out.println(x);
            Thread.sleep(1000);
            System.out.println(y);
        }catch (InterruptedException e){
            System.out.println("vochinch");
        }
    }
}