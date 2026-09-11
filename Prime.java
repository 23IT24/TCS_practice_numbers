import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        if(num<2){
            System.out.println("It is not a prime number");
        }

        int count=0;
        for(int i=2;i<num;i++){
           if(num%i==0){
              count+=1;
           }
        }
    
        if(count>0){
            System.out.println("It is not a prime number");
        }else{
            System.out.println("It is a prime number");
        }
    }
}
