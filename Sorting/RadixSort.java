import java.util.*;
public class RadixSort{

    

    public static int getMax(int arr[],int n){
        int max =arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void countSort(int arr[],int n, int exp){
        int output[] = new int[n];
        int count[] = new int[10];

        // inaitailise array with 0.
        Arrays.fill(count,0);

        //count frequency
        for(int i=0;i<n;i++){
            int digit =(arr[i]/exp)%10;
            count[digit]++;
        } 
        
         
        // calculating cumutive frequency
        for(int i=1;i<10;i++){ 
            count[i] +=count[i-1];
         }

        for(int i= n-1;i>=0;i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] =arr[i];
                   count[digit]--;
        } 

        // copy output to arr

        for(int i=0;i<n;i++){
            arr[i] =output[i];
        }

        

    }







    public static void radixSort(int arr[],int n){
        int max= getMax(arr, n);
       for(int exp =1;max/exp>0;exp*=10){
        countSort(arr,n,exp);
       }
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }


    

    public static void main(String[] args) {
        int arr[] ={2,23,545,116,118,11};
        int n = arr.length;
        radixSort(arr, n);
    }
}