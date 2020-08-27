import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class Macchiato extends Coffee {

    private Map<String, Double> cupPriceMap = new HashMap<String, Double>();
    private CupTypeEnum cupType;
    private TemperatureEnum temperature;
    private MilkTypeEnum milkType;

    public Macchiato(int num, CupTypeEnum cupType, TemperatureEnum temperature, MilkTypeEnum milkType) {
        super(num);
        this.cupType = cupType;
        this.temperature = temperature;
        this.milkType = milkType;
        cupPriceMap.put(attributeEnum.CupTypeEnum.Middle.getCupType(), 33.0);
        cupPriceMap.put(attributeEnum.CupTypeEnum.Large.getCupType(), 35.0);
        cupPriceMap.put(attributeEnum.CupTypeEnum.VeryLarge.getCupType(), 38.0);
        description = num+"杯"+cupType.getCupType()+"焦糖玛奇朵，"+"温度为"+temperature.getTemperature()+"，牛奶为"+milkType.getMilkType();

    }

    public double cost() {
        return num*cupPriceMap.get(cupType.getCupType());
    }
}
