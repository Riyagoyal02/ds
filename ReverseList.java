public class ReverseList {
    class Node{  
        int data;  
        Node next;  
 
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
          if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
    public void reverse(Node current) {  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks if the next node is null, if yes then prints it.  
            if(current.next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }  
            //Recursively calls the reverse function  
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    }  
 
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
 
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
 
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
 
    public static void main(String[] args) {  
 
        ReverseList sList = new ReverseList();  
 
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
 
        System.out.println("Original List: ");  
        sList.display();  
 
        System.out.println("Reversed List: ");  
        //Print reversed list  
        sList.reverse(sList.head);  
    }  
}