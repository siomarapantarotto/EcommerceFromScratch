package br.com.siomara.model.customer;

import java.sql.Date;
import br.com.siomara.util.addressing.Address;
import br.com.siomara.util.Register;

/**
 * POJO Customer
 * @author siomara.com.br
 * @version 20190124
 */
public class Customer {

    // Customer attributes
    private int         id;
    private String      name;
    private String      telephone;
    private Date        birthday;    
    private Address     actualAddress;
    private Register    register;

    
    // Customer constructor with necessary objects
    public Customer() {
        this.actualAddress = new Address();
        this.register = new Register();
    }

    // GETTERS an SETTERS 
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(Address actualAddress) {
        this.actualAddress = actualAddress;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", telephone=" + telephone + ", birthday=" + birthday + ", actualAddress=" + actualAddress + ", register=" + register + '}';
    }
    
    
}
