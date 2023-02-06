package co.edu.unicauca.distribuidos.core.services.DTO;

import co.edu.unicauca.distribuidos.core.models.ClientEntity;
import co.edu.unicauca.distribuidos.core.models.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OfferDTO {
    private ClientEntity client;
    private ProductEntity product;
    private long value;

    public OfferDTO(){

    }
}
