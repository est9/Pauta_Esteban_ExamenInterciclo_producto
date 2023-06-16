package com.examenIntercicloPauta_Esteban.producto.repository;

import com.examenIntercicloPauta_Esteban.producto.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
