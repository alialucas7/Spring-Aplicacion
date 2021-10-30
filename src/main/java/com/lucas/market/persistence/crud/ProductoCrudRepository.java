package com.lucas.market.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.lucas.market.persistence.entity.Producto;
import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
    List<Producto> findByIdCategoria(int idCategoria);
}