public class CategoryNode {
    String category;
    LinkedList list;  // Değişken tipi LinkedList olarak düzeltildi
    public Node next;

    public CategoryNode(String category) {
        this.category = category;
        this.list = new LinkedList();
    }
}