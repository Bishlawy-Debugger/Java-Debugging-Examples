# Java-Debugging-Examples
Examples of Java debugging: linked lists, recursion, OOP fixes with explanations.

## Delete Duplicates in Linked List:

- **Bug:** The original code advanced `current` twice inside the loop, skipping node and not checking if the linked list is empty or not and causing `NullPointerException`.
- **Fix:** Checking first if the linked list is empty or not, only advance once per iteration, and check `current.next` safely.
- **Lesson:** Be careful with pointer movement in linked lists — advancing twice can skip nodes or crash and ALWAYS check for empty cases (Edge Cases).


## Delete Middle Node in Linked List:

- **Bug:** Original code crashed on lists with 1–2 nodes and used an unused variable.
- **Fix:** Added null checks, tracked `prev` pointer, and safely removed the middle node.
- **Lesson:** Always handle edge cases (empty list, single node), avoid unused variables and usage of the (SLow/Fast Pointer) --> Slow ALWAYS end up on the middle node (Helpful in many other senarios).


## Recursion Bug: Factorial Function

- **Bug:** Original code had no base case, causing infinite recursion and StackOverflowError.
- **Fix:** Added a base case (`if (n == 0) return 1;`).
- **Lesson:** Every recursive function must have a clear base case to stop recursion.
