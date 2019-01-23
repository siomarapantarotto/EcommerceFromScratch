package br.com.siomara.model.product;

import br.com.siomara.database.Query;
import java.sql.SQLException;
import java.util.List;

/**
 * ProductMgr class - CRUD for product table
 *
 * @author siomara.com.br
 * 
 */
public class ProductManager {

    private Query query;

    public ProductManager() {
        this.query = new Query();
    }

    public List getAll() throws SQLException {
        String table = "product";
        String sql = "select * from " + table;
        List<Product> products = this.query.execute(sql, table);
        return products;
    }
}
