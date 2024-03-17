public class Main {
    public static void main(String[] args) {
        CategoryLinkedList categoryList = new CategoryLinkedList();

        // Kategorileri ekle
        categoryList.addCategory("A");
        categoryList.addCategory("B");
        categoryList.addCategory("C");

        // Her bir kategoriye öğeler ekle
        categoryList.addItem("A", 1);
        categoryList.addItem("B", 2);
        categoryList.addItem("C", 3);

        // Kategorilere göre öğeleri yazdır
        categoryList.display();
    }
}
