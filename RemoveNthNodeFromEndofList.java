public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode f = dummyHead;
        int i=1;
        while(i<=n+1){
            f = f.next;
            i++;
        }
        
        while(f != null){
            f = f.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummyHead.next;
    }
