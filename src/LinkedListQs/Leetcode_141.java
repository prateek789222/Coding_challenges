package LinkedListQs;


class Ll3{
    ListNode head;
    public void add(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next =node;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
public class Leetcode_141 {
    public static void main(String[] args) {
        Ll3 list = new Ll3();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);

        list.display();
        System.out.println(list.hasCycle(list.head));
    }
}

