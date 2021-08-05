import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập số a:");
            int a = sc.nextInt();
            System.out.println("Mời nhập số b:");
            int b = sc.nextInt();

            if(a>b)
            { System.out.println("Số a là Max, số b là min");}
            if(a<b)
            { System.out.println("Số a là Min, số b là Max");}
            else
            { System.out.println("Hai số bằng nhau");}

    }
}
