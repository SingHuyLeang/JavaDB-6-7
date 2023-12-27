package Model;
public class ProductModel {
    int id;
    String name;
    int qty;
    double price;
    double total;
    int discount;
    double payment;
    String image;
    String date;

    public ProductModel(String name, int qty, double price, double total, int discount, double payment, String image) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.discount = discount;
        this.payment = payment;
        this.image = image;
    }

    public ProductModel(int id, String name, int qty, double price, double total, int discount, double payment, String image, String date) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.discount = discount;
        this.payment = payment;
        this.image = image;
        this.date = date;
    }
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public int getDiscount() {
        return discount;
    }

    public double getPayment() {
        return payment;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }
    
    
    
}
