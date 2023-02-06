package co.edu.unicauca.distribuidos.core.repositories;


import co.edu.unicauca.distribuidos.core.models.State;
import co.edu.unicauca.distribuidos.core.models.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private ArrayList<ProductEntity> lstProduct;

    public ProductRepository(){
        this.lstProduct = new ArrayList <ProductEntity>();
        cargarDatos();
    }

    public List<ProductEntity> findAll(){
        System.out.println("Invocando a listar todos");
        return this.lstProduct;
    }
    /*
    public List<ProductEntity> findAllByEstate(){

        System.out.println("Invocando a listar dependiendo del estado");
        List<ProductEntity> lstAux = this.lstProduct;
        for (int i = 0; i < lstAux.size() ; i++) {
            if(lstAux.get(i).getState().equals(State.Pendiente)){
                lstAux.remove(i);
            }
        }
        return lstAux;
    }

     */

    public ProductEntity findByEstate(){
        System.out.println("Invocando a consultar producto por estado");
        ProductEntity objProduct=null;
        for (ProductEntity product : lstProduct) {
            if(product.getState().equals(State.En_Subasta)){
                objProduct=product;
                break;
            }
        }

        return objProduct;
    }

    public ProductEntity findByID(int code){
        System.out.println("Invocando a consultar producto");
        ProductEntity objProduct=null;
        for (ProductEntity product : lstProduct) {
            if(product.getCode() == code){
                objProduct=product;
                break;
            }
        }

        return objProduct;
    }
    
    

    public ProductEntity save(ProductEntity product){
        System.out.println("Invocando a guardar producto");
        ProductEntity objProduct = null;
        if(this.lstProduct.add(product)){
            objProduct=product;
        }

        return objProduct;
    }

    public ProductEntity update (int code, ProductEntity product){
        System.out.println("Invocando a actualizar producto");
        ProductEntity objProduct = null;

        for (int i = 0; i < this.lstProduct.size(); i++) {
            if(this.lstProduct.get(i).getCode() == code){
                this.lstProduct.set(i,product);
                objProduct=product;
                break;
            }
        }
        return objProduct;
    }

    public boolean delete (int code){
        System.out.println("Invocando a eliminar producto");
        boolean bandera = false;

        for (int i = 0; i < this.lstProduct.size(); i++) {
            if(this.lstProduct.get(i).getCode() == code){
                this.lstProduct.remove(i);
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    private void cargarDatos(){
        ProductEntity obj1 = new ProductEntity(1,"arroz",23000,State.En_Subasta);
        this.lstProduct.add(obj1);
        ProductEntity obj2 = new ProductEntity(2,"azucar",17000,State.Pendiente);
        this.lstProduct.add(obj2);
    }
}
