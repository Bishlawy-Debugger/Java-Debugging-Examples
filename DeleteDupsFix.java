// Fixed version: properly handles duplicates
public LNode deleteDups(LNode head) {
    if (head == null) // checks if the list is empty or not
        return null;
    LNode current = head; 
    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            current.next = current.next.next; // remove duplicate
        } else {
            current = current.next; // move forward
        }
    }
    return head;
}
