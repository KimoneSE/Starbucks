import attributeEnum.CupTypeEnum;
import attributeEnum.MilkTypeEnum;
import attributeEnum.TemperatureEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * created by Kimone
 * date 2020/8/27
 */
public class Main {

    Map<Integer,String> coffeeMap = new HashMap<Integer, String>();
    Map<Integer,String> syrupMap = new HashMap<Integer, String>();
    Map<Integer,String> jamMap = new HashMap<Integer, String>();

    Main() {
        coffeeMap.put(1,"AmericanCoffee");
        coffeeMap.put(2,"Cappuccino");
        coffeeMap.put(3,"Macchiato");

        syrupMap.put(1,"原味糖浆");
        syrupMap.put(2,"香草糖浆");
        syrupMap.put(3,"榛果糖浆");

        jamMap.put(1,"摩卡淋酱");
        jamMap.put(2,"焦糖风味酱");
        jamMap.put(3,"");
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择需要的咖啡，1为美式咖啡(中￥25,大￥28,超大￥31)，"+
                "2为卡布奇诺(中￥28,大￥30,超大￥32)，3为焦糖玛奇朵(中￥33,大￥35,超大￥38)");
        int coffeeType = scanner.nextInt();

        System.out.println("请输入你需要的数量");
        int coffeeNum = scanner.nextInt();

        System.out.println("请选择杯型，1为中杯，2为大杯，3为超大杯");
        int cupType = scanner.nextInt();
        CupTypeEnum cupTypeEnum = CupTypeEnum.class.getEnumConstants()[cupType-1];

        System.out.println("请选择温度，1为特别热，2为热，3为微热，4为冰，5为少冰，6为去冰");
        int temperature = scanner.nextInt();
        TemperatureEnum temperatureEnum = TemperatureEnum.class.getEnumConstants()[temperature-1];

        System.out.println("请选择牛奶类型，1为全脂牛奶，2为燕麦奶，3为脱脂牛奶，4为豆奶");
        int milkType = scanner.nextInt();
        MilkTypeEnum milkTypeEnum = MilkTypeEnum.class.getEnumConstants()[milkType-1];

        Coffee coffee = CoffeeFactory.getCoffee(m.getCoffeeMap().get(coffeeType),coffeeNum, cupTypeEnum,temperatureEnum,milkTypeEnum);

        System.out.println("请开始选择风味糖浆及需要的泵数，按下q结束选择。1为原味糖浆(￥1)，2为香草糖浆(￥2)，3为榛果糖浆(￥2)，如输入1 2即为选择2泵的原味糖浆");
        Map<String, Integer> syrupNumMap = new HashMap<String, Integer>();
        String nextStr = scanner.next();
        while(!nextStr.equals("q")){
            Integer syrupId = Integer.valueOf(nextStr);
            Integer syrupNum = Integer.valueOf(scanner.next());
            syrupNumMap.put(m.syrupMap.get(syrupId),syrupNum);
            nextStr = scanner.next();
        }
        coffee = new Syrup(coffeeNum,syrupNumMap,coffee);

        System.out.println("请选择所需的淋酱，1为摩卡淋酱(￥2)，2为焦糖风味酱(￥2)，3为不选择");
        coffee = new Jam(coffeeNum,m.jamMap.get(scanner.nextInt()),coffee);
        System.out.println("订单信息如下：\n-------------------\n"+coffee.getDescription());
        System.out.println("------------------------");
        System.out.println("总价为："+coffee.cost()+"元");
    }

    public Map<Integer, String> getCoffeeMap() {
        return coffeeMap;
    }

}
