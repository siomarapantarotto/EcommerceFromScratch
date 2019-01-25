package br.com.siomara.model.addressing;

/**
 * POJO State
 *
 * @author siomara.com.br
 */
public class State {

    private int id;
    private String name;
    private String abv;

    public State() {
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
        return "State{" + "stateID=" + id + ", name=" + name + ", abv=" + abv + '}';
    }
}
