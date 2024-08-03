package DecoratorDesignPattern.Base;

import DecoratorDesignPattern.Base.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 110;
    }
}
