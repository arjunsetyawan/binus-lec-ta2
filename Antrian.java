public class Antrian {
    private Node head;

    public Antrian() {
        this.head = null;
    }

    public void push(String customerName) {
        Node newNode = new Node(customerName);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        displayQueue();
    }

    public void pop() {
        if (head == null) {
            System.out.println("Antrian Kosong");
        } else {
            head = head.next;
        }
        displayQueue();
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Antrian Kosong");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.customerName);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
}
