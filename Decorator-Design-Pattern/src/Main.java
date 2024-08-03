import DecoratorDesignPattern.Base.BasePizza;
import DecoratorDesignPattern.Base.Margherita;
import DecoratorDesignPattern.Base.VegDelight;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {

        BasePizza basePizza = new Margherita();
        System.out.println(basePizza.cost());

        BasePizza basePizza1 = new ExtraCheese(new Margherita());
        System.out.println(basePizza1.cost());

        BasePizza basePizza2 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(basePizza2.cost());

    }
}
