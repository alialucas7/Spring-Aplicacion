package com.lucas.market.persistence;

import com.lucas.market.persistence.crud.ProductoCrudRepository;
import com.lucas.market.persistence.entity.Producto;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //funcion que devuelve todos los productos como una lista
    public List<Producto> mostrarProductos(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //funcion que ordena los parametros por categoria 
    // de forma ascendente
    public List<Producto> ordenarPorCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    //funcion que busca producto por categoria
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //funcion para guardar un producto en la base de datos
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //funcion para eliminar un producto
    public void deleted(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
