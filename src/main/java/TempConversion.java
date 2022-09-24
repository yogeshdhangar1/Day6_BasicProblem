import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Faharenheit to celcius(1) or Celcius to Faharaenheint (2)");
        int result = sc.nextInt();
        if(result == 1){
            System.out.println("You to choose fahraheint to celcius ");
            System.out.println("Enter fahranheint value");
            double value = sc.nextInt();
            double valuefinal = (value-32)*5/9;
            System.out.println("Celcius is");
            System.out.println(Math.round(valuefinal*10.0)/10.0);
        }else if(result==2){
            System.out.println("You to choose celcius to fahranhient");
            System.out.println("Enter celcius  value");
            double value2 = sc.nextInt();
            double valueresult = (value2*1.8)+32;
            System.out.println("Fahraheint is ");
            System.out.println(Math.round(valueresult*10.0)/10.0);
        }else{
            System.out.println("Invalid choosen ");
        }

    }
}
