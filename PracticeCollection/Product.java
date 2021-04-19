package PracticeCollection;

import java.util.Scanner;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product inputProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm");
        System.out.println("Nhập id: ");
        this.id = sc.nextInt();
        System.out.println("Nhập tên: ");
        this.name = sc.next();
        System.out.println("Nhập giá tiền: ");
        this.price = sc.nextDouble();
        return this;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}'+"\n";
    }

    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }
}
