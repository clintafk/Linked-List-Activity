/*
 * CC 13 - Singly Linked List
 * Output by Clint Harvey Gamolo and Adriane Troy V. Roa
 */
public class IntSLLNode {
	public int info;
	public IntSLLNode next;
	public IntSLLNode(int i) {
		this(i,null);
	}
	public IntSLLNode(int i, IntSLLNode n) {
		info = i; next = n;
	}
}
