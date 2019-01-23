/**
 * Classe Person - Super
 */
package br.com.siomara.util.person;

/**
 *
 * @author siomara.com.br
 */
public abstract class Person {

    private String name;
    private String contactPhone;

    public Person() {
    }

    public Person(String name, String contactPhone) {
        this.setName(name);
        this.setContactPhone(contactPhone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", contactPhone=" + contactPhone + '}';
    }

}
