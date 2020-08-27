import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class AmericanCoffee extends Coffee {
    private Map<String, Double> cupPriceMap = new HashMap<String, Double>();
    private CupTypeEnum cupType;
    private TemperatureEnum temperature;
    private MilkTypeEnum milkType;

    public AmericanCoffee(int num, CupTypeEnum cupType, TemperatureEnum temperature, MilkTypeEnum milkType) {
        super(num);
        this.cupType = cupType;
        this.temperature = temperature;
        this.milkType = milkType;

        description = num+"杯"+cupType.getCupType()+"美式咖啡，"+"温度为"+temperature.getTemperature()+"，牛奶为"+milkType.getMilkType();
        cupPriceMap.put(CupTypeEnum.Middle.getCupType(),25.0);
        cupPriceMap.put(CupTypeEnum.Large.getCupType(),28.0);
        cupPriceMap.put(CupTypeEnum.VeryLarge.getCupType(),31.0);
    }

    public double cost() {
        return num*cupPriceMap.get(cupType.getCupType());
    }

}
