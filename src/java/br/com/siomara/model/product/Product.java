package br.com.siomara.model.product;

import br.com.siomara.util.Register;

/**
 * POJO Product 
 * @author  siomara.com.br
 * @version 20160914
 */
public class Product {

     
    // Class attributes
    private int         id;
    private String      name;    
    private float       weight;
    private float       price;
    private String      detail;
    private Register    register;
    private ProductType productType;

    
    // NO ARGUMENT constructor
    public Product() {
        this.productType = new ProductType();
        this.register = new Register();
    }

    
    // GET and SET methods
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

}
