public ListNode middleNode(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next != null){
            return slow.next;
        }else{
            return slow;
        }
    }
