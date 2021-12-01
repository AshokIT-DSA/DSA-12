
public class LinkedList {
	public static void main(String[] args) {
             Node head=null;
            LinkedList l=new LinkedList();
          head=   l.insertAtTheEnd(head, 10);
          System.out.println(head.hashCode());
          head=   l.insertAtTheEnd(head, 20);
       //   System.out.println(head.hashCode());
          
          head=   l.insertAtTheEnd(head, 30);
        //  System.out.println(head.hashCode());
          head=   l.insertAtTheEnd(head, 40);
        //  System.out.println(head.hashCode());
        
                   l.insertAtTheEnd(head, 100);
                   l.print(head);
	}
	public void print(Node head) {
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public Node insertAtTheEnd(Node head,int data) {
		
		Node t=new Node(data);
		if(head==null) {
			return t;
		}
		Node temp=head;
		while(head.next!=null) {
			head=head.next;
		}
		head.next=t;
		return temp;
		//10-20-30-40
	}
}

class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}

}
