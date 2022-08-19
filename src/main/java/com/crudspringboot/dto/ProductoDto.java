package com.crudspringboot.dto;

import lombok.Data;

@Data
public class ProductoDto {

    private Long id;
    private String nombre_producto;
    private String descripcion_producto;
    private Long cantidad_producto;
    private Boolean estado_producto;


}
