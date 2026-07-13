import java.util.*;
public class CountSort{

   public static void countSort(int arr[]){

        // get max element
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        //creating a count arr
        int count[] = new int[max+1];
        Arrays.fill(count,0);
       

        // counting frequency of elements
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // Rebuild the sorted array;
        int index=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[index] =i;
                index++;
                count[i]--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args){
      int arr[] = {1,2,3,2,5,6,3};

     countSort(arr);
    }
}