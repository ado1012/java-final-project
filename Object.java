package finalproject;

/**
 *
 * @author Ado
 */

// inheritance
public class Object extends Objects {
    private int year;

    public Object(String item, double baseprice, int year ) {
        super(item, baseprice);
        this.year = year;
    }

    // setter and getter for year variable
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
