package br.com.siomara.util.addressing;

import br.com.siomara.database.Query;



/**
 * Classe CountryMgr com funcionalidades
 *
 * @author siomara.com.br
 */
public class CountryManager {

    private Query query;

    public CountryManager() {
        this.query = new Query();
    }

    public void addNew(Country country) {
        String query = "insert into country(name, abv) values('" + country.getName() +
                "', '" + country.getAbv() + "')"; 
        this.query.execute(query);
    }

    public void save(Country country) {
        String sql = "update country set name = '" + country.getName()
                + "', abv = '" + country.getAbv()
                + "' where id = " + country.getId();
        this.query.execute(sql);
    }

    public void remove(Country country) {
        String query = "delete from country where id = " + country.getId();
        this.query.execute(query);
        
     }

    // public ResultSet getAll()
//    public void getAll() {
//        //Statement stmt = null;
//        String query = "select * from country";
//
//        try {
//            stmt = this.connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                int countryID = rs.getInt(1);
//                String countryName = rs.getString(2);
//                String abv = rs.getString(3);
//                System.out.println(countryName + " - " + countryID + " - " + abv);
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro: " + e);;
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException ex) {
//                    //Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }

    // Recupera um único registro da tabela country
//    public Country getByID(int id) {
//        //Statement stmt = null;
//        String query = "select * from country where id = " + id;
//        Country country = new Country();
//
//        try {
//            stmt = this.connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                country.setCountryID(rs.getInt(1));
//                country.setName(rs.getString(2));
//                country.setAbv(rs.getString(3));
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro: " + e);
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException ex) {
//                    System.out.println("Erro: " + ex);
//                    //Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        return country;
//    }
    
    

}
