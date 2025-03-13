package model;

public class Product {
    private String name;
    private Integer id;
    private Double price;
    private Integer quantity;
    private Integer code;

    public void setProduct1(String names, Integer ide, Double prices, Integer quantitys, Integer codes) {
        name = names;
        id = ide;
        price = prices;
        quantity = quantitys;
        code = codes;
    }

   public  void getProduct() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Code: " + code);
    }
}