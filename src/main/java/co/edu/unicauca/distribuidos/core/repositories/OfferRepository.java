package co.edu.unicauca.distribuidos.core.repositories;


import co.edu.unicauca.distribuidos.core.models.ClientEntity;
import co.edu.unicauca.distribuidos.core.models.OfferEntity;
import co.edu.unicauca.distribuidos.core.models.ProductEntity;
import co.edu.unicauca.distribuidos.core.models.State;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OfferRepository {
    private ArrayList<OfferEntity> lstOffer;

    public OfferRepository(){
        this.lstOffer = new ArrayList <OfferEntity>();
        cargarDatos();
    }

    public List<OfferEntity> findAll(){
        System.out.println("Invocando a listar todas las ofertas");
        return this.lstOffer;
    }

    public OfferEntity save(OfferEntity offer){
        System.out.println("Invocando a guardar oferta");
        OfferEntity objOffer = null;
        if(this.lstOffer.add(offer)){
            objOffer=offer;
        }

        return objOffer;
    }

    private void cargarDatos(){
        ClientEntity objCliente1= new ClientEntity("Carmen", "Caicedo", "juan@unicauca.edu.co", "13123112", "carmene", "12345");
        ProductEntity obj1 = new ProductEntity(1,"arroz",23000, State.En_Subasta);
        OfferEntity objPrueba = new OfferEntity(objCliente1,obj1,32000);
        this.lstOffer.add(objPrueba);
    }


}
