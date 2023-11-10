package LinkedListQs;

class Ll {
    ListNode head = null;

    public void addNode(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode deleteDuplicates() {
        if(head == null){
            return head;
        }
        ListNode t1 = head;
        ListNode t2 = t1.next;

        while(t1.next != null){
            while(t1.val == t2.val){
                t2 = t2.next;

                if(t2 == null){
                    t1.next = null;
                    return head;
                }
            }
            t1.next = t2;
            t1 = t1.next;
            t2 = t1.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
public class Leetcode_83 {
    public static void main(String[] args) {
    Ll list = new Ll();
        list.addNode(5);
        list.addNode(5);
        list.addNode(5);
        list.addNode(4);
        list.addNode(4);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(2);
        list.addNode(2);
        list.addNode(1);

        list.display();
        list.deleteDuplicates();
        list.display();
    }

}
