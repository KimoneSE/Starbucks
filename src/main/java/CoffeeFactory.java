import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class CoffeeFactory {
    public static Coffee getCoffee(String coffeeName, int num, CupTypeEnum cupType, TemperatureEnum temperature, MilkTypeEnum milkType) {
        if(coffeeName.equals("AmericanCoffee")) {
            return new AmericanCoffee(num,cupType,temperature,milkType);
        }
        if(coffeeName.equals("Cappuccino")) {
            return new Cappuccino(num,cupType,temperature,milkType);
        }
        if(coffeeName.equals("Macchiato")) {
            return new Macchiato(num,cupType,temperature,milkType);
        }
        return null;
    }
}
