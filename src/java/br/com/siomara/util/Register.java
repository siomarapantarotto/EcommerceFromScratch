package br.com.siomara.util;

import java.sql.Timestamp;

/**
 *
 * @author  siomara.com.br
 * @version 2016.09.26
 */
public class Register {
    
    private Timestamp   insertedOn;
    private String      insertedBy;
    private Timestamp   lastUpdatedOn;
    private String      lastUpdatedBy;

    public Register() {
    }

    public Timestamp getInsertedOn() {
        return insertedOn;
    }

    public void setInsertedOn(Timestamp insertedOn) {
        this.insertedOn = insertedOn;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }

    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public String toString() {
        return "Register{" + "insertedOn=" + insertedOn + ", insertedBy=" + insertedBy + ", lastUpdatedOn=" + lastUpdatedOn + ", lastUpdatedBy=" + lastUpdatedBy + '}';
    }
    
    
}
