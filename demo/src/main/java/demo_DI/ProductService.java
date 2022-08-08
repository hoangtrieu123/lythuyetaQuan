package demo_DI;

public class ProductService implements ICRUDProduct{
    @Override
    public void display() {
        System.out.println("Hello World");
    }

    @Override
    public String delete() {
        return "C0422H1";
    }
}
