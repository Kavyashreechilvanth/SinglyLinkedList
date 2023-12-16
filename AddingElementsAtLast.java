package SLL;

public class AddingElementsAtLast {
	public static void main(String[] args) {
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.add(90);
		s1.add(89);
		s1.add(78);
		s1.add(64);
		s1.add("hello");

		System.out.println(s1);
	}
}

class SinglyLinkedList{
	class Node{
		Object data;
		Node next;

		Node(Object data){
			this.data=data;
		}
	}
	Node head;

	void add(Object data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;

	}

	public String toString() {
		String str="";
		Node t=head;
		while(t!=null) 
		{
			str=str+t.data;
			if(t.next!=null)
				str=str+"->";
			t=t.next;
		}
		return str;
	}
}


