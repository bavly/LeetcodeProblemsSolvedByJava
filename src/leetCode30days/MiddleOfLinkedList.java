package leetCode30days;


public class MiddleOfLinkedList {

	public ListNode middleNode(ListNode head) {
		

		int counter = 0;
		int middle = 0;
		ListNode test = head;
		while (test.next != null) {
			test = test.next;
			counter++;

		}
		counter++;

		if (counter % 2 == 0) {
			middle = counter / 2 + 1;
			counter = 1;
		} else {
			middle = counter / 2;
			counter = 0;
		}

		while (head.next != null) {
			if (counter == middle)
				return head;

			else {
				counter++;
				head = head.next;
			}

		}

		return head;

	}
}
