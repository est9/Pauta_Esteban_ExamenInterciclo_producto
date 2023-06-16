package com.examenIntercicloPauta_Esteban.producto.service;

import com.examenIntercicloPauta_Esteban.producto.entity.ProductoEntity;
import com.examenIntercicloPauta_Esteban.producto.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {

        this.productoRepository = productoRepository;
    }

    public ProductoEntity createProducto(ProductoEntity productoentity) {
        return productoRepository.save(productoentity);
    }

    public ProductoEntity getProductoEntityById(Integer id) {
        return productoRepository.findById(id).get();
    }

    public List<ProductoEntity> findAll(){
        return productoRepository.findAll();
    }


}

