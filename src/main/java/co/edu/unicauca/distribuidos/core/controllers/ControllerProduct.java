package co.edu.unicauca.distribuidos.core.controllers;



import co.edu.unicauca.distribuidos.core.services.DTO.ProductDTO;
import co.edu.unicauca.distribuidos.core.services.services.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ControllerProduct {

    //INYECCION DE DEPENDENCIAS
    @Autowired
    private IServiceProduct serviceProduct;
    

    @GetMapping("/")
    @ResponseBody
    public List<ProductDTO> findAll(){
        return this.serviceProduct.findAll();
    }

    @GetMapping("/{code}")
    @ResponseBody
    public ProductDTO findById(@PathVariable int code){
        return serviceProduct.findById(code);
    }

    @PostMapping("/")
    @ResponseBody
    public ProductDTO create(@RequestBody ProductDTO product){
        return this.serviceProduct.createProduct(product);
    }

    @GetMapping("/state")
    public List<ProductDTO> findAllByState(){
        return this.serviceProduct.findAllByState();
    }

    @PatchMapping("/{code}")
    @ResponseBody
    public ProductDTO update(@RequestBody ProductDTO product, @PathVariable int code){
        ProductDTO objProduct = null;
        ProductDTO productActually = this.serviceProduct.findById(code);
        if(productActually != null){
            objProduct = this.serviceProduct.update(code,product);
        }
        return objProduct;
    }

    @DeleteMapping("/{code}")
    @ResponseBody
    public boolean delete (@PathVariable int code){
        boolean bandera = false;
        ProductDTO actually = this.serviceProduct.findById(code);
        if(actually != null){
            bandera = this.serviceProduct.delete(code);
        }
        return bandera;
    }
}
