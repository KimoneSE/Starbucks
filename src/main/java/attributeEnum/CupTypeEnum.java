package attributeEnum;

/**
 * created by Kimone
 * date 2020/8/27
 */
public enum CupTypeEnum {
    Middle("中杯"),Large("大杯"),VeryLarge("超大杯");

    private String cupType;

    CupTypeEnum(String cupType) {
        this.cupType = cupType;
    }

    public String getCupType(){
        return cupType;
    }
}
