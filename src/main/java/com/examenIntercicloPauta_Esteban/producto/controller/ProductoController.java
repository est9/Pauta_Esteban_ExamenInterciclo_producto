package com.examenIntercicloPauta_Esteban.producto.controller;

import com.examenIntercicloPauta_Esteban.producto.entity.ProductoEntity;
import com.examenIntercicloPauta_Esteban.producto.repository.ProductoRepository;
import com.examenIntercicloPauta_Esteban.producto.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ex_productos")
public class ProductoController {

    private final ProductoService productoService;
    private final ProductoRepository productoRepository;

    public ProductoController(ProductoService productoService, ProductoRepository productoRepository) {
        this.productoService = productoService;
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public ProductoEntity createProducto(@RequestBody ProductoEntity productoentity) {
        return productoService.createProducto(productoentity);
    }

    @GetMapping("/{id}")
    public ProductoEntity getProductoEntityById(@PathVariable Integer id) {
        return productoService.getProductoEntityById(id);
    }
    @PutMapping("/{id}")
    public ProductoEntity actualizarProducto(@PathVariable Integer id, @RequestBody ProductoEntity nuevoproducto){
        ProductoEntity producto = productoRepository.findById(id).orElseThrow(()->new RuntimeException("No existe el producto"));
        producto.setDescripcion(nuevoproducto.getDescripcion());
        producto.setPrecio(nuevoproducto.getPrecio());
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        ProductoEntity producto = productoRepository.findById(id).orElseThrow(()->new RuntimeException("No existe el producto"));
        productoRepository.delete(producto);
    }

    @GetMapping
    public List<ProductoEntity> findAll(){
        return productoService.findAll();
    }

}