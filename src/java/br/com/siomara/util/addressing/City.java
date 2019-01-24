package br.com.siomara.util.addressing;

/**
 * POJO City
 * @author siomara.com.br
 */
public class City {
    
    private int     cityID;
    private String  name;

    public City() {
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" + "cityID=" + cityID + ", name=" + name + '}';
    }
        
}
