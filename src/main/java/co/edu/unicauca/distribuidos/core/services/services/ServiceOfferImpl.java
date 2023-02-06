package co.edu.unicauca.distribuidos.core.services.services;


import co.edu.unicauca.distribuidos.core.models.OfferEntity;

import co.edu.unicauca.distribuidos.core.repositories.OfferRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.OfferDTO;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOfferImpl implements IServiceOffer {
    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OfferDTO create(OfferDTO offer) {
        OfferEntity objEntity = this.modelMapper.map(offer,OfferEntity.class);
        OfferEntity objOfferEntity = this.offerRepository.save(objEntity);
        return this.modelMapper.map(objOfferEntity, OfferDTO.class);
    }

    @Override
    public List<OfferDTO> findAll() {
        List<OfferEntity> lstEntity = this.offerRepository.findAll();
        return this.modelMapper.map(lstEntity,new TypeToken<List<OfferDTO>>(){}.getType());
    }
}
