package co.edu.unicauca.distribuidos.core.services.services;

import co.edu.unicauca.distribuidos.core.services.DTO.OfferDTO;

import java.util.List;

public interface IServiceOffer {
    public OfferDTO create (OfferDTO offer);
    public List<OfferDTO> findAll();
}
