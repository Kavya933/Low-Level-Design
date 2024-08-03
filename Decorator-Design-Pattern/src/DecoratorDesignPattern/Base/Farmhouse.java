package DecoratorDesignPattern.Base;

import DecoratorDesignPattern.Base.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
