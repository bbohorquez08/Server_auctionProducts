package co.edu.unicauca.distribuidos.core.controllers;



import co.edu.unicauca.distribuidos.core.services.DTO.OfferDTO;
import co.edu.unicauca.distribuidos.core.services.services.IServiceOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("offers")
public class ControllerOffer {
    //INYECCION DE DEPENDENCIAS
    @Autowired
    private IServiceOffer serviceOffer;

    @PostMapping("/")
    @ResponseBody
    public OfferDTO create(@RequestBody OfferDTO product){
        return this.serviceOffer.create(product);
    }

    @GetMapping("/")
    @ResponseBody
    public List<OfferDTO> findAll(){
        return this.serviceOffer.findAll();
    }
}
