
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        int a,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        temp=n;
        while (temp>0) {
            a = temp % 10;
            sum = sum + a * a * a;
            temp /=10;
        }
        if(sum==n){
            System.out.println(n+" is Armstrong number");
        }else {
            System.out.println(n+" is not Armstrong number");
        }

    }
}
