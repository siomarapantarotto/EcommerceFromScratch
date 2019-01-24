package br.com.siomara.util.addressing;

/**
 * POJO Country
 *
 * @author siomara.com.br
 */
public class Country {

    private int id;
    private String name;
    private String abv;

    public Country() {
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

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    @Override
    public String toString() {
        return "Country{" + "countryID=" + id + ", name=" + name + ", abv=" + abv + '}';
    }

}
