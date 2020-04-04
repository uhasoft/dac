package com.uhasoft.dac.service.impl;

import com.uhasoft.dac.entity.Resource;
import com.uhasoft.dac.service.ResourceService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Service
public class ResourceServiceImpl implements ResourceService {

  private final Mapper<Resource> mapper;

  public ResourceServiceImpl(Mapper<Resource> mapper) {
    this.mapper = mapper;
  }

  @Override
  public Mapper<Resource> getMapper() {
    return mapper;
  }
}
