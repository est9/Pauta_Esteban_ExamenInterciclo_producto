package com.examenIntercicloPauta_Esteban.producto.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data						//crea los get y set automaticamente
@AllArgsConstructor			//crea el constructor automaticamente
@NoArgsConstructor  		//crea el constructor vacio automaticamente
public class ProductoEntity {

    @Id                                                            //clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //genera de manera automatica el incremento
    private Integer id;
    private String codigoProducto;
    private String descripcion;
    private String precio;
}
