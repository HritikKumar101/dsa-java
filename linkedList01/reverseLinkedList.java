public class reverseLinkedList{

    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> finalHead = reverseLL(head.next);
        Node<Integer> temp = finalHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next =head;
        head.next =null;

        return finalHead;
    
    }
    public static void main(String args[]){
     Node<Integer> head = LinkedListUse.takeInput();
     head = reverseLL(head);
     LinkedListUse.Print(head);
    }
}