package co.edu.unicauca.distribuidos.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OfferEntity {
    private ClientEntity client;
    private ProductEntity product;
    private long value;

    public OfferEntity(){

    }
}
