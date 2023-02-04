package App.Rest;

import App.Repository.ProductRepository;
import App.Entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
