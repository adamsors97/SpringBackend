package hu.szte.prf.beadando.models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int itemid;
    private Date purchasedate;
    public Sale(){
        
    }
    public Sale(int id, int itemid, Date purchasedate) {
        this.id = id;
        this.itemid = itemid;
        this.purchasedate = purchasedate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getItemId() {
        return itemid;
    }
    public void setItemId(int itemid) {
        this.itemid = itemid;
    }
    public Date getPurchaseDate() {
        return purchasedate;
    }
    public void setPurchaseDate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }
    @Override
    public String toString() {
        return "Sale [id=" + id + ", itemid=" + itemid + ", purchasedate=" + purchasedate + "]";
    }
    

}
