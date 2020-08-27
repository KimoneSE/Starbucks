package attributeEnum;

/**
 * created by Kimone
 * date 2020/8/27
 */
public enum MilkTypeEnum {
    WholeMilk("全脂牛奶"),OatMilk("燕麦奶"),SkimmedMilk("脱脂牛奶"),SoyMilk("豆奶");

    private String milkType;

    MilkTypeEnum(String milkType) {
        this.milkType = milkType;
    }

    public String getMilkType() {
        return milkType;
    }
}
