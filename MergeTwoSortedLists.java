public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode tempNode = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tempNode.next = list1;
                list1 = list1.next;
            } else {
                tempNode.next = list2;
                list2 = list2.next;
            }
            tempNode = tempNode.next;
        }

        tempNode.next = (list1 == null) ? list2 : list1;

        return dummyNode.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }