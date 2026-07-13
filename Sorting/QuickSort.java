

public class QuickSort{


    public static  int Partition(int arr[], int s, int e){
     int pivot= arr[s];
     int cnt= 0;
     for(int i=s+1;i<e;i++){
        if(arr[i]<pivot){
            cnt++;
        }
     }

     int partitionIndex =s+cnt;
     //swap
     int temp = arr[s];
     arr[s] =arr[partitionIndex];
     arr[partitionIndex] =temp;



     int i=s,j=e;

     while(i <partitionIndex && partitionIndex<j){
        while(arr[i]<pivot){
            i++;
        }
        while(arr[j]>pivot){
            j--;
        }

        if(i <partitionIndex && partitionIndex<j){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        
     }
     return partitionIndex;
    }

    public static void quickSort(int arr[],int s,int e){

        if(s>=e){
            return;
        }

        int pivot = Partition(arr,s,e);
        quickSort(arr, s, pivot-1);
        quickSort(arr, pivot+1, e);

    }
    public static void main(String[] abc){
        int arr[] = {3,4,6,8,2,4,5};
        int n =arr.length;

        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
