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
        System.out.println("Berhasil menambahkan antrian!");
        displayQueue();
    }

    public void pop() {
        if (head == null) {
            System.out.println("Tidak ada antrian yang menunggu!");
        } else {
            head = head.next;
            System.out.println("Berhasil melepas antrian terdepan!");
            displayQueue();
        }
    }

    public void displayQueue() {
        System.out.print("Antrian saat ini : ");
        if (head == null) {
            System.out.println("<empty>");
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
