// Buggy version: skips nodes and may throw NullPointerException
public LNode deleteDups(LNode head) {
    LNode current = head;
    LNode prev = head;
    while (current != null) {
        current = current.next; // advances too early
        if (current.data == prev.data)
            prev.next = current.next;
        else
            prev = current;
        current = current.next; // advances again, skipping nodes
    }
    return head;
}
