package main;

import demo_DI.ICRUDProduct;
import demo_DI.ProductService;
import demo_DI.TestService;

public class DemoController {
    private ICRUDProduct demoService;
    public DemoController() {
        ICRUDProduct crud = new ProductService();
        ICRUDProduct crud1 = new TestService();
        demoService = crud1;
    }

    public ICRUDProduct getDemoService() {
        return demoService;
    }
}
