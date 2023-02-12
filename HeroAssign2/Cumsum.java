import java.util.*;
class Cumsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ps[]=new int[a.length];
        ps[0]=a[0];
        for(int i=1;i<a.length;i++){
                ps[i]=ps[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
               System.out.print(ps[i]+" ");
        }
    }
}