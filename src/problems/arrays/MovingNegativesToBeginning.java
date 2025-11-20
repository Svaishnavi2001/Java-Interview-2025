package problems.arrays;

public class MovingNegativesToBeginning {
    public static void main(String[] args) {

        int[] ar={1, -2, 3, -4, 5, -6, 7, -8};
        int i=0;
        int j=ar.length-1;

        while(i<=j){
            if(ar[i]<0 && ar[j]<0){
                i++;
            }
            else if(ar[i]>=0 && ar[j]<0){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
            else if(ar[i]>0 && ar[j]>0){
                j--;
            }
            else {
                i++;
                j--;
            }
        }

        for(int n: ar){
            System.out.println(n);
        }
    }
}
