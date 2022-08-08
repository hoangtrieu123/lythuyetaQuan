package main;

import demo_DI.ICRUDProduct;
import demo_DI.ProductService;

public class Main {

    public static void main(String[] args) {
//        ProductService productService = new ProductService();
//        ICRUDProduct crud = new ProductService();
//        productService.display();
//        System.out.println(productService.delete());
//        crud.display();
//        System.out.println(crud.delete());
        DemoController demoController = new DemoController();
        demoController.getDemoService().display();
        System.out.println(demoController.getDemoService().delete());
    }
}
