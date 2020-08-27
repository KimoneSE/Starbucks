import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class Syrup extends IngredientDecorator {
    private Coffee coffee;
    private Map<String, Double> syrupPriceMap = new HashMap<String, Double>();
    private Map<String,Integer> syrupNumMap;//用户选择的糖浆以及泵数

    public Syrup(int num, Map syrupNumMap, Coffee coffee) {
        super(num);
        this.syrupNumMap = syrupNumMap;
        this.coffee = coffee;
        syrupPriceMap.put("原味糖浆",1.0);
        syrupPriceMap.put("香草糖浆",2.0);
        syrupPriceMap.put("榛果糖浆",2.0);
    }

    public String getDescription() {
        String syrupNumStr = "";
        for(String syrupType:syrupNumMap.keySet()) {
            syrupNumStr+=", "+syrupNumMap.get(syrupType)+"泵"+syrupType;
        }
        return coffee.getDescription()+syrupNumStr;
    }

    public double cost() {
        double syrupPrice = 0;
        for(String syrupType:syrupNumMap.keySet()) {
            syrupPrice+=syrupPriceMap.get(syrupType) * syrupNumMap.get(syrupType);
        }
        return coffee.cost()+num*syrupPrice;
    }
}
