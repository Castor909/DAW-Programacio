public class eliminarPares {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node eliminarParesIterativo(Node head) {
        // Throw away even elements at the beginning of the list
        while (head != null && head.data % 2 == 0)  head = head.next;
        // If the list became empty, return null
        if (head == null) return null;
        Node current = head;
        while (current.next != null)
            if (current.next.data % 2 == 0) current.next = current.next.next; // Ignore the even element
            else current = current.next; // Go to the next element
        return head;
    }
    
    public static Node generateList(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }

    public static void printList(Node head) {    
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = generateList();
        head = eliminarParesIterativo(head);
        printList(head);
        //-----------------------------------
        head = generateList();
        head = eliminarParesRecursivo(head);
        printList(head);
    }

    public static Node eliminarParesRecursivo(Node head) {
        if (head == null) return null; // Check if the list is empty
        if (head.data % 2 == 0) return eliminarParesRecursivo(head.next); // Skip the even element
        head.next = eliminarParesRecursivo(head.next); // Process the rest of the list
        return head;
    }
}
