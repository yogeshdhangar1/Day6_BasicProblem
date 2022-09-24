import java.util.Scanner;

public class Fibonacinum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(),a1=1,a2=0,a3;
        System.out.println(a1+" "+a2);
        for(int i = 2;i<count;i++){
            a3 = a1+a2;
            System.out.println(" "+a3);
            a1=a2;
            a2=a3;
        }
    }
}
