import java.io.*;
import java.util.*;
class G10{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n!=0){
            int t=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
