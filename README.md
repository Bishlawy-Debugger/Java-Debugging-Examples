# Java-Debugging-Examples
Examples of Java debugging: linked lists, recursion, OOP fixes with explanations.

## Delete Duplicates in Linked List:

- **Bug:** The original code advanced `current` twice inside the loop, skipping node and not checking if the linked list is empty or not and causing `NullPointerException`.
- **Fix:** Checking first if the linked list is empty or not, only advance once per iteration, and check `current.next` safely.
- **Lesson:** Be careful with pointer movement in linked lists — advancing twice can skip nodes or crash and ALWAYS check for empty cases (Edge Cases).
