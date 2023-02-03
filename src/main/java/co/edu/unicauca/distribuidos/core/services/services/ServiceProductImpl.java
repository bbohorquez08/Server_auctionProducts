package co.edu.unicauca.distribuidos.core.services.services;






import co.edu.unicauca.distribuidos.core.models.ProductEntity;
import co.edu.unicauca.distribuidos.core.repositories.ProductRepository;


import co.edu.unicauca.distribuidos.core.services.DTO.ProductDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProductImpl implements IServiceProduct {

    //INYECCION DE DEPENDENCIAS
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO createProduct(ProductDTO product) {
        ProductEntity objEntity = this.modelMapper.map(product,ProductEntity.class);
        ProductEntity objProductEntity = this.productRepository.save(objEntity);
        return this.modelMapper.map(objProductEntity,ProductDTO.class);
    }

    @Override
    public List<ProductDTO> findAll() {
        List<ProductEntity> lstEntity = this.productRepository.findAll();
        return this.modelMapper.map(lstEntity,new TypeToken<List<ProductDTO>>(){}.getType());
    }

    @Override
    public List<ProductDTO> findAllByState() {
        List<ProductEntity> lstEntity = this.productRepository.findAllByEstate();
        return this.modelMapper.map(lstEntity,new TypeToken<List<ProductDTO>>(){}.getType());
    }

    @Override
    public ProductDTO findById(int code) {
        ProductEntity objEntity = this.productRepository.findByID(code);
        return this.modelMapper.map(objEntity,ProductDTO.class);
    }

    @Override
    public ProductDTO update(int code, ProductDTO product) {
        ProductEntity productEntity = this.modelMapper.map(product,ProductEntity.class);
        ProductEntity productEntityUpdate = this.productRepository.update(code,productEntity);
        return this.modelMapper.map(productEntityUpdate,ProductDTO.class);
    }

    @Override
    public boolean delete(int code) {
        return this.productRepository.delete(code);
    }
}
