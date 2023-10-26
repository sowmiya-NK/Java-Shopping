package shopping;


import java.sql.Timestamp;
import java.util.ArrayList;

public class Cart {
    private int id;
    private User user;
    private ArrayList<Cartproduct> cartproducts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Cartproduct> getCartproducts() {
        return cartproducts;
    }

    public void setCartproducts(ArrayList<Cartproduct> cartproducts) {
        this.cartproducts = cartproducts;
    }
}
