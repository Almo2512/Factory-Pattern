public abstract class  Resturant {

    public Pizza orderPizza(String type)
    {
        Pizza pizza=createPizza();
        pizza.preparePizza(type);
        return pizza;
    }

    public abstract Pizza createPizza();

}
