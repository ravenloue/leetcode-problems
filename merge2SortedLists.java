/** Problem definition:
  * You are given the heads of two sorted linked lists list1 and list2.
  * Merge the two lists in a one sorted list. The list should be made by
  * splicing together the nodes of the first two lists.
  *
  * Return the head of the merged linked list.
  *
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode() {}
  *     ListNode(int val) { this.val = val; }
  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  * }
  */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // new merged list
        ListNode merged = new ListNode(-1);
        
        // pointer variable for last node on list
        ListNode pointer = merged;
        
        // iterate through the two lists
        while (list1 != null && list2 != null){
            
            // compare elements and add the smaller to the new merged list
            if (list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }
            else{
                pointer.next = list2;
                list2 = list2.next;
            }
            
            // update the pointer
            pointer = pointer.next;
        }
        
        // if either list empties, append the other list's elements
        if(list1 == null){
            pointer.next = list2;
        }
        else if (list2 == null){
            pointer.next = list1;
        }
        
        // returns the completed merged list without the initial element
        return merged.next;
    }
}
