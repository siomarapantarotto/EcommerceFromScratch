package br.com.siomara.model.order;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author siomara.com.br
 */
public class OrderManager {

    // Estabelecer conexao com o banco de dados
    // Inserir novo produto
    // Update produto
    // Delete produto
    // Soma pesos
    public Double getTotalWheight(Vector v) {
        Double totalWheight = 0.0;
        Enumeration vEnum = v.elements(); 
        while (vEnum.hasMoreElements()) {
            Double vlr = (Double) vEnum.nextElement();
            totalWheight = totalWheight + vlr;
        }       
        return totalWheight;
    }

// demais métodos ......  
}
