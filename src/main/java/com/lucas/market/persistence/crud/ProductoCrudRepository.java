package com.lucas.market.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.lucas.market.persistence.entity.Producto;


public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
}