package co.edu.unicauca.distribuidos.core.services.services;



import co.edu.unicauca.distribuidos.core.services.DTO.ProductDTO;

import java.util.List;

public interface IServiceProduct {
    //METODO QUE ME PERMITE REGISTRAR PRODUCTOS
    public ProductDTO createProduct(ProductDTO admin);
    //METODO QUE ME PERMITE OBTENER TODOS LOS PRODUCTOS
    public List<ProductDTO> findAll();
    //METODO QUE ME PERMITE OBTENER PRODUCTO POR ESTADO
    public List<ProductDTO> findAllByState();
    //METODO QUE ME PERMITE OBTENER UN PRODUCTO EN ESPECIFICO
    public ProductDTO findById(int code);
    //METODO QUE ME PERMITE EDITAR EL PRODUCTO
    public ProductDTO update(int code, ProductDTO product);
    //METODO QUE ME PERMITE ELIMINAR EL PRODUCTO
    public boolean delete (int code);
}
