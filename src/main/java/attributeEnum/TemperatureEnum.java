package attributeEnum;

/**
 * created by Kimone
 * date 2020/8/27
 */
public enum TemperatureEnum {
    VeryHot("特别热"),Hot("热"),Warm("微热"),Icy("冰"), LessIce("少冰"), Deicing("去冰");
    private String temperature;

    TemperatureEnum(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
