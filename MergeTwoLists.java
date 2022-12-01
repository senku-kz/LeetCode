public class MergeTwoLists {
    public static void main (String[] arg) {
        System.out.println("Hello World");
        ListNode r1;
//        r1 = MergeTwoLists.mergeTwoLists(
//                new ListNode(1, new ListNode(2, new ListNode(4))),
//                new ListNode(1, new ListNode(3, new ListNode(4)))
//        );
//        printList(r1);

        r1 = MergeTwoLists.mergeTwoLists(
                new ListNode(2),
                new ListNode(1)
        );
        printList(r1);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode res_lst = new ListNode();
        ListNode lst = res_lst;

        while (list1 != null | list2 != null){
            if (list1!=null && list2!=null && list1.val<list2.val){
                lst.next = new ListNode(list1.val);
                lst = lst.next;
                list1 = list1.next;
            }else if (list1!=null && list2!=null && list1.val>list2.val){
                lst.next = new ListNode(list2.val);
                lst = lst.next;
                list2 = list2.next;
            } else if (list1!=null && list2!=null){
                lst.next = new ListNode(list1.val);
                lst = lst.next;
                list1 = list1.next;

                lst.next = new ListNode(list2.val);
                lst = lst.next;
                list2 = list2.next;
            } else if (list1!=null & list2==null) {
                lst.next = new ListNode(list1.val);
                lst = lst.next;
                list1 = list1.next;
            } else if (list1==null & list2!=null) {
                lst.next = new ListNode(list2.val);
                lst = lst.next;
                list2 = list2.next;
            }
        }
        return res_lst.next;
    }

    public static void printList(ListNode lst){
        while (lst != null){
            System.out.print(lst.val+ ", ");
            lst = lst.next;
        }
        System.out.println();
    }
}
