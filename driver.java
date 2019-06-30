package finalproject;
import java.util.Scanner;

/**
 *
 * @author Ado
 */
public class driver {
    public static void main(String[] args){
        AuctionHouse ac = new AuctionHouse();
        ac.addToAuction(new Object("Hudson 42 'Big Boy'", 85000.0, 1942));
        ac.addToAuction(new Object("Packard-12", 5999999.0, 1935));
        ac.addToAuction(new Object("Großer Mercedes-Benz 770", 6999999.0, 1937));
        ac.addToAuction(new Object("Chevrolet Master Deluxe", 24995.0, 1936));
        ac.addToAuction(new Object("Cadillac Series 61", 99990.0, 1941));
        ac.addToAuction(new Object("Lincoln Continental", 35000.0, 1942));
        ac.addToAuction(new Object("Willys Americar 383 V8", 155999.0, 1941));
        ac.addToAuction(new Object("Ford Black LT350 V3", 89999.0, 1934));
        ac.addToAuction(new Object("Plymouth Deluxe 351 Cleveland V7", 39995.0, 1935));
        ac.addToAuction(new Object("Cadillac Fleetwoord Brougham", 6995.0, 1985));
        
        System.out.println("Welcome to the Auction House. Here are our selection of cars: ");
        System.out.println("============================================================");
        ac.displayList();
        System.out.println("============================================================");
        System.out.println("What would you like to buy? input number: ");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        ac.bidding(ac.getCars().get(pick-1), pick);
    }
}

