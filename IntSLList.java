/*
 * CC 13 - Singly Linked List
 * Output by Clint Harvey Gamolo and Adriane Troy V. Roa
 */

public class IntSLList {
	protected IntSLLNode head, tail;
	public IntSLList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

    public void addToHead(int el) {
        if(!isEmpty()) head = new IntSLLNode(el,head);
        else head = tail = new IntSLLNode(el);
    }
	
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		}
		else head = tail = new IntSLLNode(el);
	}

    public int deleteFromHead() {
        int el = head.info;
        head = head.next;
        return el;
    }

	public int deleteFromTail() { 
		int el = tail.info;
		if (head == tail) 
			head = tail = null;
		else { 
			IntSLLNode tmp; 
			for (tmp = head; tmp.next != tail; tmp = tmp.next);
				tail = tmp; 
			tail.next = null;
		}
		return el;
	}

	public void printAll() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        System.out.print("Values in list: ");
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
		System.out.println();
	}

    public void delete(int n) {
        IntSLLNode tmp;
        IntSLLNode newList = null;
        for (tmp = head; tmp != null; tmp = tmp.next){
            if(n == tmp.info){
                tmp = tmp.next;
            }
            try{
                newList = new IntSLLNode(tmp.info,newList);
            } catch(NullPointerException e){
                deleteFromTail();
                System.out.println(n+" is deleted.");
                return;
            }
        }
        head = null;
        while(newList != null){
            addToHead(newList.info);
            newList = newList.next;
        }
        System.out.println(n+" is deleted.");
    }

    public boolean isInList(int n) {
        IntSLLNode tmp;
		for (tmp = head; tmp != null; tmp = tmp.next)
			if(n == tmp.info) return true; 
        return false;
    }
}
