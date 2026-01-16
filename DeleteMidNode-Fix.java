// Fixed version: safely deletes middle node
public LNode deleteMid(LNode head) {
    if (head == null || head.next == null) {
        return null; // empty or single-node list
    }

    LNode slow = head;
    LNode fast = head;
    LNode prev = null;

    // Move slow to middle, fast to end
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    //  Delete the middle node
    if (prev != null) {
        prev.next = slow.next;
    }

    return head;
}
