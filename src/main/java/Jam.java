import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class Jam extends IngredientDecorator {
    private Coffee coffee;
    private String jamType;
    private Map<String, Double> jamPriceMap = new HashMap<String, Double>();

    public Jam(int num, String jamType, Coffee coffee) {
        super(num);
        this.jamType = jamType;
        this.coffee = coffee;
        jamPriceMap.put("摩卡淋酱",2.0);
        jamPriceMap.put("焦糖风味酱",2.0);
    }

    public String getDescription() {
        return coffee.getDescription()+","+jamType;
    }

    public double cost() {
        double jamPrice = 0;
        if(!jamType.equals("")) jamPrice=num*jamPriceMap.get(jamType);
        return coffee.cost()+jamPrice;
    }
}
