public class Node {
    Urun urun;
    Node next;

    public Node(Urun urun) {
        this.urun = urun;
        this.next = null;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}