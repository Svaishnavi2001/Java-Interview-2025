package problems.arrays;

public class MovingAllZerosToEnd {
    public static void main(String[] args) {

        int[] ar={0,1,0,3,0,5,0,6,7,8,9};

        int i=ar.length-1;
        int j=0;


        while(j<=i){
            if(ar[j]==0 && ar[i]==0){
                j++;
            }
            else if(ar[j]==0 && ar[i]>0){
                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
                j++;
                i--;
            }
            else if(ar[i]>0  && ar[j]>0){
                j++;
            }
            else {
                j++;
                i--;
            }
        }
        for(int n: ar){
            System.out.println(n);
        }

    }
}
