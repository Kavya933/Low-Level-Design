package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Base.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;
    // Constructor injection
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
