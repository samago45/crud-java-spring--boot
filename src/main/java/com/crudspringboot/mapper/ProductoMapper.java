package com.crudspringboot.mapper;

import com.crudspringboot.dto.ProductoDto;
import com.crudspringboot.entity.ProductoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper implements BaseMapper<ProductoEntity, ProductoDto> {

    ProductoDto productoDto = new ProductoDto();

    @Override
    public ProductoDto toDto(ProductoEntity productoEntity) {

        productoDto.setId(productoEntity.getIdProducto());
        productoDto.setNombre_producto(productoEntity.getNombreProducto());
        productoDto.setCantidad_producto(productoEntity.getCantidad());
        productoDto.setDescripcion_producto(productoEntity.getDescripcion());
        productoDto.setEstado_producto(productoEntity.getEstado());
        return productoDto;
    }

    @Override
    public ProductoDto detalleDTO(ProductoEntity productoEntity) {
        return null;
    }

    @Override
    public ProductoEntity toEntity(ProductoDto productoDto) {
        return null;
    }

    @Override
    public ProductoEntity toCreateEntity(ProductoDto productoDto) {
        return null;
    }

    @Override
    public ProductoEntity toUpdateEntity(ProductoDto productoDto) {
        return null;
    }
}