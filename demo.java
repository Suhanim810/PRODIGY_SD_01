import java.util.Scanner;
class demo{
    public static void main(String [] args){
        double celsius,fahrenheit,kelvin;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Celsius value");
        celsius=sc.nextFloat();
        fahrenheit=(celsius*9/5)+32;
        System.out.println("The fahrenheit value is="+fahrenheit);
        kelvin=celsius+273.15;
        System.out.println("The kelvin value is="+kelvin);    
    }
}