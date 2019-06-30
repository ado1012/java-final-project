package finalproject;
import java.util.ArrayList;

/**
 *
 * @author Ado
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class AuctionHouse implements Bidding {
    // create an ArrayList object using array
    private ArrayList<Object> cars = new ArrayList<>();

    public ArrayList<Object> getCars() {
        return cars;
    }
    
    // to put objects into the auction
    public void addToAuction(Object c){
        cars.add(c);
    }
    
    // display the name of item, its price, and year
    public void displayList(){
        for(int i = 0; i < cars.size(); i++){
            System.out.println((i+1) + " " + cars.get(i).getItem() + ", Price: $" + cars.get(i).getBaseprice() + ", Year: " + cars.get(i).getYear());
        }
    }
    
    // to remove objects from auction
    public void removeFromAuction(int index){
        cars.remove(index-1);
    }

    // main auction house function
    // polymorphism
    @Override
    public int bidding(Object object, int p) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("name your price: ");
            double price;
            try{    
                price = sc.nextDouble();
            }
            catch(InputMismatchException x){
                System.out.println("input must be an integer!");
                sc.next();
                continue;
            }
            if (price > object.getBaseprice()){
                object.setBaseprice(price);
                int opt1;
                while(true){
                    System.out.println("would anyone like to bid again? (1 for yes, 2 for no): ");
                    try{
                        opt1 = sc.nextInt();
                    }
                    catch(InputMismatchException y){
                        System.out.println("input must be an integer!");
                        sc.next();
                        continue;
                    }
                    if(opt1 ==1){
                        break;
                    }
                    else if(opt1 ==2){
                         System.out.println(cars.get(p-1).getItem() +" is sold for $" + price + " !!!");
                         return 0;
                    }
                    else{
                        System.out.println("Please input either 1 or 2!");
                    }
                }               
            }
            else {
                System.out.println("your price must be higher than base price!");
            }
        }
    }   
}
