public class MergeTwoSortedArray{

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Method 1
        // for(int i=0;i<n;i++){
        //     nums1[m+i]=nums2[i];
        //     }
        //      Arrays.sort(nums1);
        // 

        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i >=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        // if nums2 has more element left
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        
        }

public static void main(String[] abc){
   int nums1[]={1,2,3,0,0,0};
   int nums2[]={2,5,6};
   int m=3;
   int n=nums2.length;
   System.out.println(m+" "+n);

   merge(nums1, m, nums2,n);

   for (int i=0;i<m+n;i++) {
    System.out.print(nums1[i]+" ");
       
   }
}
}