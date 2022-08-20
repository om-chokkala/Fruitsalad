import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        boolean check;
        // Block of code that takes input from user and add it to Arraylist
        do
        {
            System.out.println("Enter an item and it's price");
            items.add(scanner.nextLine());
            //System.out.println("Enter its price");
            price.add(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Would like to enter more items and price,Say yes or no");
            String input= scanner.next();
            scanner.nextLine();
            if(input.equals("yes"))
            {
                check=true;
            }
            else
            {
                check=false;
            }
        }while (check);

        ShoppingList shoppinglist= new ShoppingList(items,price);
        System.out.println("Expensive item is: "+shoppinglist.expensiveItem()+ " and its price is: "+shoppinglist.maxPrice());
        System.out.println("Cheapest item is: "+shoppinglist.cheapestItem()+" and its price is: "+shoppinglist.minPrice());

        /* ShoppingList shoppingList1= new ShoppingList("Mango",50.0);
        ShoppingList shoppingList2= new ShoppingList("Apple",90.0);
        ShoppingList shoppingList3= new ShoppingList("Banana",10.0);
        ShoppingList shoppingList4= new ShoppingList("Kiwi",200.0);


        double a= Math.max(shoppingList1.price,shoppingList2.price);
        double b= Math.max(a,shoppingList3.price);
        double c= Math.max(b,shoppingList4.price);

        System.out.println("Highest Price :" + c);

        if(c== shoppingList1.price)
        {
            System.out.println(shoppingList1.items);
        } else if (c==shoppingList2.price) {
            System.out.println(shoppingList2.items);
        } else if (c==shoppingList3.price) {
            System.out.println(shoppingList3.items);
        }
            else{
            System.out.println(shoppingList4.items);
        }
*/
    }
}