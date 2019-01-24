package br.com.siomara.model.product;

/**
 * POJO ProductType
 * @author siomara.com.br
 * @version 20190124
 */
public class ProductType {
    
    private int     id;
    private String  description;

    public ProductType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductType{" + "id=" + id + ", description=" + description + '}';
    }
    
    
    
}
