
class MergeTwoLists {
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // attach list1 node
                list1 = list1.next;    // move list1 forward
            } else {
                current.next = list2;  // attach list2 node
                list2 = list2.next;    // move list2 forward
            }
            current = current.next;    // move current pointer
        }

        // Attach the remaining list (only one of these will be non-null)
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;  // skip dummy and return the merged head
    }
}
