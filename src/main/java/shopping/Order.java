package shopping;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;

public class Order {
    private int id;
    private Date date;

    private ArrayList<Cart> carts;

    public ArrayList<Cart> getCarts() {
        return carts;
    }

    public void setCarts(ArrayList<Cart> carts) {
        this.carts = carts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
