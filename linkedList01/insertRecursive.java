public class insertRecursive{
    public static Node<Integer> insertR(Node<Integer> head, int pos, int elem){

        if(pos == 0){
            Node<Integer> newNode =new Node<>(elem);
            newNode.next = head;
            return newNode;
        }

        head.next = insertR(head.next,pos-1,elem);

        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = LinkedListUse.takeInput();
        head =insertR(head,3,16);
        LinkedListUse.Print(head);
    }
}