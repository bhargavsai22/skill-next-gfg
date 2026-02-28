/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
 
class Solution {
    public Node reverseKGroup(Node head, int k) {

        if (head == null) return null;

        Node curr = head;
        Node prev = null;
        Node nextNode = null;
        int count = 0;
        while (curr != null && count < k) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            count++;
        }
        if (curr != null) {
            head.next = reverseKGroup(curr, k);
        }

        return prev;
    }
}