package co.edu.unicauca.distribuidos.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ProductEntity {
    private int code;
    private String name;
    private long initValue;
    private State state;
    private long currentBid;

    public ProductEntity(){
        this.setCurrentBid(0L);
    }
}
