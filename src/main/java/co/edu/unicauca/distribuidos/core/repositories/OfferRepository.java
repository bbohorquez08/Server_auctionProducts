package co.edu.unicauca.distribuidos.core.repositories;


import co.edu.unicauca.distribuidos.core.models.OfferEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OfferRepository {
    private ArrayList<OfferEntity> lstOffer;

    public OfferRepository(){
        this.lstOffer = new ArrayList <OfferEntity>();
        //cargarDatos();
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


}
