import java.io.*;
import java.util.*;
class G12{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ori=n;
        int sum=0,t;
        while(n!=0){
            t=n%10;
            sum=sum*10+t;
            n=n/10;
        }
        if(ori==sum){
          System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
