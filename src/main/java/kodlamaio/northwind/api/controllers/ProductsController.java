package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;


@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	@Autowired //tüm projede productservice yi implement eden sınıfı arayıp buluyor ve bunu getiriyor 
	//yani bussiness katmanındaki productmanageri. ve bu sayede bussines katmanına 
	//injection ile erişmiş oluyoruz.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
}
