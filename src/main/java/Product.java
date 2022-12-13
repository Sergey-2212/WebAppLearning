public class Product {

    private String title;
    private double cost;
    private int id = 0;

    public Product(String title, int id) {
        this.title = title;
        this.id = id;
        this.cost = 100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
