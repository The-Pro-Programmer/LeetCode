package linkedLists.medium;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p=l1, q=l2;
		ListNode current = result;
		int carry = 0;
		while(p!=null || q!=null) {
			int x = p!=null ? p.val : 0;
			int y = q!=null ? q.val : 0;
			int sum = x+y+carry;
			carry = sum/10;
			current.next = new ListNode(sum%10);
			current = current.next;
			p = p!=null ? p.next : null;
			q = q!=null ? q.next : null;
		}
		if(carry>0) {
			current.next = new ListNode(carry);
		}
		return result.next;
		
	}
	class ListNode {
		int val;
		ListNode next;
		ListNode() {
		}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
