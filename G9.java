import java.io.*;
import java.util.*;
class G9{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(k==i)
               break;
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
