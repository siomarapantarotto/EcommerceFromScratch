package br.com.siomara.util.person;

/**
 *
 * @author siomara.com.br
 */
public final class JuridicalPerson extends Person {
    
    private String cnpj;
    private String legalName;

    public JuridicalPerson() {
    }

    public JuridicalPerson(String cnpj, String legalName) {
        this.setCnpj(cnpj);
        this.setLegalName(legalName);
    }

    public JuridicalPerson(String cnpj, String legalName, String name, String contactPhone) {
        super(name, contactPhone);
        this.cnpj = cnpj;
        this.legalName = legalName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        System.out.println("Estou no setCnpj(String cnpj) do JuridicalPerson");
        if (cnpj != "11111111111") {
            this.cnpj = cnpj;
        }

    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        System.out.println("Estou no setLegalName(String legalName) do JuridicalPerson");
        this.legalName = legalName;
    }

    
   
}
