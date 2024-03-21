public class Stack {
    private Node top;

    public void push(Urun urun) {
        Node newNode = new Node(urun);
        newNode.next = top;
        top = newNode;
    }

    public Urun pop() {
        if (isEmpty()) {
            return null;
        }
        Urun poppedUrun = top.urun;
        top = top.next;
        System.out.println(poppedUrun.getAd() + " Sepetten çıkarılmıştır.");
        return poppedUrun;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }
}