class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        // 1. Declare your pointers
        ListNode head = null;
        ListNode ptr = null;
        
        while(list1 != null && list2 != null) {
            if(head == null) {
                if(list1.val < list2.val) {
                    ptr = head = list1;
                    list1 = list1.next;
                } else {
                    ptr = head = list2;
                    list2 = list2.next;
                }
                continue; 
            } // 2. Added the missing closing brace here
            
            if(list1.val < list2.val) {
                ptr.next = list1;
                ptr = list1;
                list1 = list1.next;
            } else { 
                // 3. Changed duplicate list1 check to handle list2
                ptr.next = list2;
                ptr = list2;
                list2 = list2.next;
            }
        }
        
        if(list1 != null) {
            ptr.next = list1;
        } else {
            ptr.next = list2;
        }
        
        return head;
    }
}