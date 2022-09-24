import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt(),sum=0,rem;
        for(int i =1;i<num;i++){
            rem = num%i;
            if(rem==0){
                sum = sum+i;
            }
        }
        if(sum==num){
            System.out.println("Its Perfect number");
        }else{
            System.out.println("Its Not Perfect Number");
        }
    }
}
