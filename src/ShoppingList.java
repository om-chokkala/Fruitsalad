import java.util.ArrayList;
public class ShoppingList {
    private ArrayList<String> items;
    private ArrayList<Double> price;
    public ShoppingList(ArrayList<String> items, ArrayList<Double> price) {
        this.items = items;
        this.price = price;
    }

    // Method that fetches maximum price
    public double maxPrice()
    {
        double max=0;
        for (double i : price) {
            max = Math.max(max, i);
        }
        return max;
    }
    // Extracting the expensive item based on maximum price
    public String expensiveItem(){
        int i; double max=maxPrice();
        for (i=0; i < price.size()-1;i++) {
            if( max== price.get(i)){
                break;
            }
        }
        return items.get(i);
    }

    // Method that fetches minimum price
    public double minPrice()
    {
        double min=maxPrice();
        for (Double i : price) {
            min = Math.min(min, i);
        }
        return min;
    }
    // Extracting the cheapest item based on minimum price
    public String cheapestItem(){
        int i;
        double min=minPrice();
        for (i=0; i < price.size()-1;i++) {
            if( min== price.get(i)){
               break;
            }
        }
        return items.get(i);
    }
}
