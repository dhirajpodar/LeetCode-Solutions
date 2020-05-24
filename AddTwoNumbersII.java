public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
            
        }
        return prev;
    }
    
    public ListNode insertToHead(ListNode head, int x){
        if(head == null){
            return new ListNode(x);
        }else{
            ListNode node = new ListNode(x);
            node.next = head;
            head =node;
            return head;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode res = null;
        int carry =0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            res = insertToHead(res,sum%10);
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + carry;
            res = insertToHead(res,sum%10);
            carry = sum/10;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            res = insertToHead(res,sum%10);
            carry = sum/10;
            l2 = l2.next;
        }
        if(carry != 0){
            res = insertToHead(res,carry);
        }
        return res;
    }
