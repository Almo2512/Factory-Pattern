public class ResturantDubi extends Resturant {
    @Override
    public Pizza createPizza() {
        return new SchweinFreeProduct();
    }
}
