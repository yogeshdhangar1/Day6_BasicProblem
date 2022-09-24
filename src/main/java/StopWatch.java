import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime =0,endTime =0,elapsedTime =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te 1 to start The Stop Watch:");
        int input1 = sc.nextInt();
        if(input1==1){
            startTime = System.currentTimeMillis();
            System.out.println(startTime);
            System.out.println("Enter the 0 to end the stop Watch");
            int input2 = sc.nextInt();
            if(input2==0){
                endTime = System.currentTimeMillis();
                System.out.println(endTime);
            }
            System.out.println("Elasped Time Between start time and end time Click is :");
            elapsedTime = (endTime-startTime)/1000;
            System.out.println(elapsedTime+" seconds");
        }
    }
}
