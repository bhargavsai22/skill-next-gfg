/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(k==0||head==null)
            return head;
            /*1.find length of list
              2.reduce k using module(to avoid rotation)
              3.make list circular
              4.move to kth node
              5.set(k+1)th
              */
        Node curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len+=1;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        curr.next=head;
        curr=head;
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
        
    }
    
    
}