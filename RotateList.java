 public int size(ListNode head){
        ListNode t = head;
        int size = 0;
        if(t == null) return size;
        while(t != null){
            size++;
            t =t.next;
        }
        return size;
    }
    public ListNode rotate(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.next = head;
        head = temp.next;
        temp.next = null;
        return head;
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int size = size(head);
        for(int i =0; i<k%size;i++){
            head = rotate(head);
        }
        return head;
    }
