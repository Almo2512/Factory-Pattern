public class ResturantHof extends Resturant{
    @Override
    public Pizza createPizza() {
        return new SchweinProduct();
    }
}
