public class UrunList {
    Node head;
    public UrunList(){
        this.head = null;
    }
    // Yeni bir düğüm eklemek için
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Bağlı listedeki tüm öğeleri yazdırmak için
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}

