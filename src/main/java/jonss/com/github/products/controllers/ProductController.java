package jonss.com.github.products.controllers;

import jonss.com.github.products.daos.ProductDao;
import jonss.com.github.products.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDao dao;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "home mesmo mew!";
    }


    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Product product) {
        dao.save(product);
    }


}
