package br.com.siomara.util.addressing;

/**
 *
 * @author siomara.com.br
 */
public class Country {

    private int countryID;
    private String name;
    private String abv;

    public Country() {
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
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
        return "Country{" + "countryID=" + countryID + ", name=" + name + ", abv=" + abv + '}';
    }

}
