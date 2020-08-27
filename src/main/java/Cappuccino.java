import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class Cappuccino extends Coffee {
    private Map<String, Double> cupPriceMap = new HashMap<String, Double>();
    private CupTypeEnum cupType;
    private TemperatureEnum temperature;
    private MilkTypeEnum milkType;

    public Cappuccino(int num, CupTypeEnum cupType, TemperatureEnum temperature, MilkTypeEnum milkType) {
        super(num);
        this.cupType = cupType;
        this.temperature = temperature;
        this.milkType = milkType;

        cupPriceMap.put(attributeEnum.CupTypeEnum.Middle.getCupType(),28.0);
        cupPriceMap.put(attributeEnum.CupTypeEnum.Large.getCupType(),30.0);
        cupPriceMap.put(attributeEnum.CupTypeEnum.VeryLarge.getCupType(),32.0);
        description = num+"杯"+cupType.getCupType()+"卡布奇诺，"+"温度为"+temperature.getTemperature()+"，牛奶为"+milkType.getMilkType();

    }

    public double cost() {
        return num*cupPriceMap.get(cupPriceMap.get(cupType.getCupType()));
    }
}
