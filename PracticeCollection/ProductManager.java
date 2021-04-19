package PracticeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.*;

public class ProductManager implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()>o2.getPrice()) {
            return 1;
        } else if(o1.getPrice()==o2.getPrice()){
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product(1, "Milo", 90000);
        Product product2 = new Product(2, "Soda", 8000);
        Product product3 = new Product(3, "Mirinda", 9000);
        Product product4 = new Product(4, "Fata", 90900);

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println(products);
        Product newProduct = new Product();
        products.add(newProduct.inputProduct());

        System.out.println(products);

        System.out.println("Nhập id cần sửa: ");
        int id1 = sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (id1 == products.get(i).getId()) {
                System.out.println("Nhập id mới: ");
                int newId = sc.nextInt();
                products.get(i).setId(newId);
                System.out.println("Nhập tên mới: ");
                String newName = sc.next();
                products.get(i).setName(newName);
                System.out.println("Nhập giá tiền mới: ");
                double newPrice = sc.nextDouble();
                products.get(i).setPrice(newPrice);
            }
        }
        System.out.println(products);

        System.out.println("Nhập id cần xóa: ");
        int id2 = sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (id2 == products.get(i).getId()) {
                products.remove(i);
            }
        }
        System.out.println(products);

        System.out.println("Sắp xếp theo tên: ");
        Collections.sort(products);
        for (Product a: products){
            System.out.println(a.toString());
        }

        System.out.println("Sắp xếp theo giá tiền");
        ProductManager productManager = new ProductManager();
        Collections.sort(products, productManager);
        for (Product x: products){
            System.out.println(x.toString());
        }
    }
}
