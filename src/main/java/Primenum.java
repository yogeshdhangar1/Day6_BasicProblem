import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Its Prime number");
        }else {
            System.out.println("Its Not Prime Number");
        }
    }
}
