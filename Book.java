class Book {
    String title;
    String authorName;
    double price;

    Book(String t, String a, float p) {
        title = t;
        authorName = a;
        price = p;

    }

    void display() {
        System.out.println("Title:" + title);
        System.out.println("Author Name:" + authorName);
        System.out.println("Price:" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Love that died", "Janu", 65000);
        Book b2 = new Book("Scars", "Janvy", 950000);
        b1.display();
        b2.display();
    }

}
