package co.edu.unicauca.distribuidos.core.services.DTO;

import co.edu.unicauca.distribuidos.core.models.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    private int code;
    private String name;
    private long initValue;
    private State state;
    public ProductDTO(){

    }
}
