
import java.util.Scanner;







public class LinkedListUse{


    // public static Node<Integer> takeInput(){
    //     Node<Integer> head =null;
    //     Scanner sc = new Scanner(System.in);
    //     int data = sc.nextInt();

    //     while(data != -1){
    //         Node<Integer> newNode =  new Node<Integer>(data);
    //         if(head == null){
    //            head = newNode;
    //         }else{
    //             Node<Integer> temp = head;
    //             while(temp.next != null){
    //                 temp = temp.next;
    //             }

    //             temp.next = newNode;
    //         }

    //         data = sc.nextInt();
    //     }

    //     return head;
      
    // }

    // Use a tail variable for storing last Node address....

    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
         Node<Integer> temp = head;
         Node<Integer> newNode = new Node<Integer>(data);
        int i =0;

        if(pos ==0){
          newNode.next = head;
          return newNode;
        }

        while(i<pos-1){
           temp = temp.next;
           i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }


    public static Node<Integer> delete(Node<Integer> head, int pos){
        int i =0;
        Node<Integer> temp = head;
        if(head == null || pos < 0){
            return head;
        }

        if(pos ==0){
            return head.next;
        }
        while(temp != null && i<pos-1){
         temp = temp.next;
         i++;
        }
        if(temp!= null && temp.next != null){
            temp.next = temp.next.next;
        }

        return head;
    }


    

    public static Node<Integer> takeInput(){
        Node<Integer> head =null;
         Node<Integer> tail =null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode =  new Node<Integer>(data);
            if(head == null){
               head = newNode;
               tail = newNode;
            }else{
                // Node<Integer> temp = head;
                // while(temp.next != null){
                //     temp = temp.next;
                // }

                // temp.next = newNode;

                tail.next = newNode;
                tail = newNode; // tail = tail.next
            }

            data = sc.nextInt();
        }

        return head;
      
    }


    

    public static void Print(Node head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp =temp.next;
        }
        System.out.println("null");

    }



public static void main(String[] args) {
      
        // Node node1 = new Node(10);
        // Node node2 = new Node(20);
        // System.out.println(node1.data);
        // System.out.println(node1.next);
        // System.out.println(node2.data);
        // System.out.println(node2.next);

        // node1.next = node2;
        // System.out.println(node1.data);
        // System.out.println(node1.next);



        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2= new Node<Integer>(20);
        // Node<Integer> node3= new Node<Integer>(30);
        // Node<Integer> node4= new Node<Integer>(40);

        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;

        // Node<Integer> head = node1;

        Node<Integer> head = takeInput();
        head =insert(head,100,3);
        head = delete(head,8);
        Print(head);
        

    }
}