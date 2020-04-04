package com.uhasoft.dac.service;

import com.uhasoft.dac.entity.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Weihua
 * @since 1.0.0
 */
public interface BaseService<T extends BaseEntity> {

  default T findById(String id){
    return getMapper().selectByPrimaryKey(id);
  }

  default List<T> findAll(){
    return getMapper().selectAll();
  }

  default void delete(String id){
    T entity = findById(id);
    entity.setDeleted(true);
    save(entity);
  }

  default void save(T entity) {
    Date currentTime = new Date();
    entity.setCreatedBy(entity.getLastModifiedBy());
    entity.setLastModifiedAt(currentTime);
    entity.setVersion(entity.getVersion() + 1);
    if(entity.getId() == null){
      entity.setId(UUID.randomUUID().toString());
      entity.setCreatedAt(currentTime);
      getMapper().insert(entity);
      return;
    }
    getMapper().updateByPrimaryKey(entity);
  }

  Mapper<T> getMapper();
}
