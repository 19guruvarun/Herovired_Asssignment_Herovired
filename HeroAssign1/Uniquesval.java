import java.util.*;
class Uniquesval{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arrNum[]=new int[n];
        for(int i=0;i<n;i++){
            arrNum[i]=sc.nextInt();
        }
        int c=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            boolean val=true;
            for(int j=0;j<c;j++){
                if(arrNum[i]==res[j]){
                    val=false;
                    break;
                }
            }
            if(val){
                res[c]=arrNum[i];
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.print(res[i]+" ");
        }
    }
}