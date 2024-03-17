public class CategoryLinkedList {
    CategoryNode head;

    public CategoryLinkedList() {
        this.head = null;
    }

    public void addCategory(String category) {
        CategoryNode newCategory = new CategoryNode(category);
        if (head == null) {
            head = newCategory;
        } else {
            CategoryNode temp = head;
            while (temp.next != null) { // next değişkenine göre sona kadar gidilir
                temp = temp.next;
            }
            temp.next = newCategory;
        }
    }

    public void addItem(String category, int data) {
        CategoryNode currentCategory = head;
        while (currentCategory != null) {
            if (currentCategory.category.equals(category)) {
                currentCategory.list.addItem(data);
                return;
            }
            currentCategory = currentCategory.next;
        }
        System.out.println("Kategori bulunamadı.");
    }

    public void display() {
        CategoryNode currentCategory = head;
        while (currentCategory != null) {
            System.out.println("Kategori: " + currentCategory.category);
            currentCategory.list.display();
            System.out.println();
            currentCategory = currentCategory.next;
        }
    }

}