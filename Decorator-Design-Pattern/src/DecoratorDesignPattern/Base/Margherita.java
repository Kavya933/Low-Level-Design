package DecoratorDesignPattern.Base;

import DecoratorDesignPattern.Base.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
