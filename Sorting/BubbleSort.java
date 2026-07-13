public class BubbleSort{
    public static void main(String[] args){
        // Bubble sort
       int arr[] = {7,8,3,1,2};

        //    for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //            int temp = arr[i];
        //            arr[i] =arr[j];
        //            arr[j] =temp;
        //         }
        //     }
        //    }

        // In the above code we are also sorting the sorted array .
        // after every one iteration 1 element is sorted so
        // the correct code is 

        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
               int temp = arr[j];
               arr[j] =arr[j+1];
               arr[j+1] =temp;
            }
        }
       }





       for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]);
       }
    }
}