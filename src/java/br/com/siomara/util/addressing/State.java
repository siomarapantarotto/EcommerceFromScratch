package br.com.siomara.util.addressing;

/**
 *
 * @author siomara.com.br
 */
public class State {
    
    private int     stateID;
    private String  name;
    private String  abv;

    public State() {
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("===> Estou no setName(String name) de State");
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
        return "State{" + "stateID=" + stateID + ", name=" + name + ", abv=" + abv + '}';
    }
    
    
}
