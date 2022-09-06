public class IntSLList {
	protected IntSLLNode head, tail;
	public IntSLList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		}
		else head = tail = new IntSLLNode(el);
	}
	
	public int deleteFromTail() { // delete the tail and return its info;
		int el = tail.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node on the list,
			IntSLLNode tmp; // find the predecessor of tail;
			for (tmp = head; tmp.next != tail; tmp = tmp.next);
				tail = tmp; // the predecessor of tail becomes tail;
			tail.next = null;
		}
		return el;
	}

	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
		System.out.println();
	}

	checkIfInside(int n) {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			if(n == IntSLList[tmp]);
				System.out.println(n + "is inside");
			}
}
