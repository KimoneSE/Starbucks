import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * created by Kimone
 * date 2020/8/27
 */

public class CoffeeTest {
    @Test
    public void Test1() {
        Coffee coffee = new AmericanCoffee(1, CupTypeEnum.Large, TemperatureEnum.Deicing, MilkTypeEnum.OatMilk);
        Map<String,Integer> syrupMap = new HashMap<String, Integer>();
        syrupMap.put("原味糖浆",2);
        syrupMap.put("香草糖浆",1);
        coffee = new Syrup(1,syrupMap,coffee);
        assertEquals("total price",32,coffee.cost(),0.0);
    }

    @Test
    public void Test2() {
        Coffee coffee = new Cappuccino(2, CupTypeEnum.Middle, TemperatureEnum.Deicing, MilkTypeEnum.OatMilk);
        Map<String,Integer> syrupMap = new HashMap<String, Integer>();
        coffee = new Jam(1,"摩卡淋酱",coffee);
        assertEquals("total price",60,coffee.cost(),0.0);
    }

    @Test
    public void Test3() {
        Coffee coffee = new Macchiato(1, CupTypeEnum.VeryLarge, TemperatureEnum.Deicing, MilkTypeEnum.OatMilk);
        Map<String,Integer> syrupMap = new HashMap<String, Integer>();
        assertEquals("total price",38,coffee.cost(),0.0);
    }
}
