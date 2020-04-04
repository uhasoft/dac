package com.uhasoft.dac.service.impl;

import com.uhasoft.dac.entity.Right;
import com.uhasoft.dac.service.RightService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Service
public class RightServiceImpl implements RightService {

  private final Mapper<Right> mapper;

  public RightServiceImpl(Mapper<Right> mapper) {
    this.mapper = mapper;
  }

  @Override
  public Mapper<Right> getMapper() {
    return mapper;
  }
}
