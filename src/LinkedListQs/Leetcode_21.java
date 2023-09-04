package LinkedListQs;

class Ll2 {
    ListNode head = null;

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        Ll2 t3 = new Ll2();
        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                t3.add(t1.val);
                t1 = t1.next;
            }
            else{
                t3.add(t2.val);
                t2 = t2.next;
            }
        }
        while(t1 != null){
            t3.add(t1.val);
            t1 = t1.next;
        }
        while(t2 != null){
            t3.add(t2.val);
            t2 = t2.next;
        }
        return t3.head;
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
public class Leetcode_21 {
    public static void main(String[] args) {
        Ll2 list1 = new Ll2();
        Ll2 list2 = new Ll2();

        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        list1.display();
        list2.display();

        Ll2 list3 = new Ll2();
        list3.head = list3.mergeTwoLists(list1.head, list2.head);
        list3.display();
    }
}
