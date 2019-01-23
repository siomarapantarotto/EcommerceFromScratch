package util;

import br.com.siomara.util.person.JuridicalPerson;
import br.com.siomara.util.person.PhysicalPerson;

/*
 * Teste Classe Person e suas filhas
 */
/**
 * @author 80114369
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Person personPai = new Person(); // referência à superclass

        System.out.println("\nCriando juridical pperson 1");
        JuridicalPerson jp1 = new JuridicalPerson("11111111111", "Microsoft S.A.", "Microsoft", "9988-6677");
        System.out.println(jp1);
        
        System.out.println("\nCriando juridical person 2");
        JuridicalPerson jp2 = new JuridicalPerson();
        System.out.println(jp2);
        jp2.setLegalName("Apple SA");
        jp2.setCnpj("11111111111");
        jp2.setContactPhone("+55 (061) 9999-8888");
        jp2.setName("Apple");
        System.out.println(jp2);
        
        System.out.println("\nCriando physical person 1");
        PhysicalPerson pp1 = new PhysicalPerson(null, "Maria da Silva", "9876-5432");
        System.out.println(" alterando physical person 1 " + pp1);
        pp1.setNickname("Morticia");
        System.out.println("physical person 1 = " + pp1);
    }

}
