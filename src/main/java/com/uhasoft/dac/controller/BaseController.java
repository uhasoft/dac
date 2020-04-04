package com.uhasoft.dac.controller;

import com.uhasoft.dac.entity.BaseEntity;
import com.uhasoft.dac.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Weihua
 * @since 1.0.0
 */
public abstract class BaseController<T extends BaseEntity> {

  @Autowired
  private BaseService<T> service;

  @GetMapping("/{id}")
  public T findById(@PathVariable String id){
    return service.findById(id);
  }

  @GetMapping
  public List<T> findAll(){
    return service.findAll();
  }



}
