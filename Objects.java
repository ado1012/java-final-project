package finalproject;
/**
 *
 * @author Ado
 */
public class Objects {
    // instance variables
    private String item;
    private double baseprice;
    
    // construction declaration of class
    public Objects(String item, double baseprice){
        this.item = item;
        this.baseprice = baseprice;
    }    

    // setter and getter for Item names and prices
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }
    
}
