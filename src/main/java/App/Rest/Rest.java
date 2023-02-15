package App.Rest;

import App.Entity.Product;
import App.Repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Rest {

    public ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
