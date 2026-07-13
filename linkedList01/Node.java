
// public class Node{
//     int data;
//     Node next;

//      Node (int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// used Generics for different types of data

public class Node<T>{
     T data;
     Node<T> next;

      Node (T data){
        this.data = data;
        this.next = null;
    }
}