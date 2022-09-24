import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int r,sum =0,temp;
        while(num>0){
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
           System.out.println(sum);
    }
}
