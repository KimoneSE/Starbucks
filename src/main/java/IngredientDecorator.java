/**
 * created by Kimone
 * date 2020/8/27
 */
public abstract class IngredientDecorator extends Coffee {
    public IngredientDecorator(int num) {
        super(num);
    }

    public abstract String getDescription();
    public abstract double cost();
}
