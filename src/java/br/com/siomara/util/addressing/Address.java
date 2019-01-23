/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siomara.util.addressing;

/**
 * Classe Address - Composition
 * @author siomara.com.br
 */
public class Address {
    
    // Atributos nativos do Java
    private int     addressID;
    private String  addressLine1;
    private String  addressLine2;
    private String  zipcode;
    
    private Country country;
    private State state;
    private City city;

    public Address() { 
        this.city = new City();        
        this.state = new State();        
        this.country = new Country();
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "addressID=" + addressID + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", zipcode=" + zipcode + ", country=" + country + ", state=" + state + ", city=" + city + '}';
    }
    
}
