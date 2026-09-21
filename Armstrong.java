import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int original=num;
        int temp=num;
        int digits=0;
        int sum=0;

        while(temp>0){
            digits++;
            temp=temp/10;
        }

        while(num>0){
            int digit = num % 10;

            int power = 1;
            for(int i = 0; i < digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            num = num / 10;
        }

        if(original==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a armstrong number");
        }
    }
}