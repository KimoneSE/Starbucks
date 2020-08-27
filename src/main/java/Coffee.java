import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/27
 */
public abstract class Coffee {
    String description = "";
    int num;


    public Coffee(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
