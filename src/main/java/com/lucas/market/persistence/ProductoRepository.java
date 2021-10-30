package com.lucas.market.persistence;

import com.lucas.market.persistence.crud.ProductoCrudRepository;
import com.lucas.market.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //funcion que devuelve todos los productos como una lista
    public List<Producto> mostrarProductos(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    
}
