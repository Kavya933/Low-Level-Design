package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Base.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza basePizza;
    // constructor injection
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
