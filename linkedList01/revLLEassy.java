public class revLLEassy{
    public static Node<Integer> reverseLLR(Node<Integer> head){
        if (head==null || head.next == null ){
            return head;
        }
        Node<Integer> reversedTail = head.next;
        Node<Integer> smallHead = reverseLLR(head.next);
        reversedTail.next = head;
        head.next=null;
        return smallHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = LinkedListUse.takeInput();
        head =reverseLLR(head);
        LinkedListUse.Print(head);
    }
}