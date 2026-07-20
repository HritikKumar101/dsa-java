import java.util.LinkedList;

public class listCollections{
    



   public static void main(String[] args) {
       LinkedList<Integer> list = new  LinkedList<>();

       list.add(10); // add numbers to the last of linked list
       list.add(20);
       list.add(30);
       list.addFirst(40); // add numbers at 1st postion

       System.out.println(list.size());

       for(int ele : list){
        System.out.print(ele + "->");
       }

       for(int i =0;i<list.size();i++){
        System.out.print(list.get(i) + " ");
       }
       
       Integer arr[] =  list.toArray( new Integer[0]);

       for(int e : arr){
        System.err.print(e + "_");
       }


       LinkedList<String> linkedlist = new LinkedList<String>();
       linkedlist.add("java");
       linkedlist.add("python");
       linkedlist.add("c++");

       String str[] = linkedlist.toArray(new String[0]);


       System.out.println(linkedlist);


       for(String s : str){
        System.out.print(s+" ");
       }

       

       

   }
}