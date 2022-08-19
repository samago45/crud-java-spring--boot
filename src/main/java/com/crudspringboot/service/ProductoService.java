package com.crudspringboot.service;


import com.crudspringboot.dto.ProductoDto;
import com.crudspringboot.entity.ProductoEntity;
import com.crudspringboot.mapper.ProductoMapper;
import com.crudspringboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    @Autowired
    private ProductoMapper productoMapper;


    public List<ProductoEntity> finAll() {
        return repository.findAll();
    }

}
