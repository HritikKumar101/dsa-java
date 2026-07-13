// this code decrease the time complexicity from On^2 to On using a tail .

public class revLLBetter{
    public static doubleNode reverseLL2(Node<Integer> head){
        if (head == null || head.next == null){
            doubleNode ans = new doubleNode();
            ans.head =head;
            ans.tail =head;
            return ans;
        }

        doubleNode smallAns = reverseLL2(head.next);
        smallAns.tail.next = head;
        head.next = null;
        doubleNode ans = new doubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }

    public static void main(String[] args) {
        Node<Integer> head = LinkedListUse.takeInput();
        doubleNode ans =reverseLL2(head);
        head =ans.head;
        LinkedListUse.Print(head);

    }
}