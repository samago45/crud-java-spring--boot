package com.crudspringboot.mapper;


import org.mapstruct.Mapper;

@Mapper
public interface BaseMapper<Entity, DTO> {

    public DTO toDto(final Entity entity);

    public DTO detalleDTO(final Entity entity);

    public Entity toEntity(final DTO dto);

    public Entity toCreateEntity(final DTO dto);

    public Entity toUpdateEntity(final DTO dto);
}
