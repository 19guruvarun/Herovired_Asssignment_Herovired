import java.util.*;
class Missingnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arrNum[]=new int[n];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            arrNum[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if((arrNum[i+1]-arrNum[i])>1){
                    for(int j=arrNum[i]+1;j<arrNum[i+1];j++){
                            al.add(j);
                    }
            }
        }
        Object[] arrobj=al.toArray();
        for(Object obj:arrobj){
            System.out.print(obj+" ");
        }
    }
}