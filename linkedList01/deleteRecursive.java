public class deleteRecursive{
    public static Node<Integer> deleteR(Node<Integer> head, int pos){
         if (pos == 0){
            return head.next;
         }

         head.next= deleteR(head.next,pos-1);

         return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = LinkedListUse.takeInput();
        head = deleteR(head, 3);
        LinkedListUse.Print(head);
    }
}