package com.uhasoft.dac.service.impl;

import com.uhasoft.dac.entity.Role;
import com.uhasoft.dac.service.RoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Service
public class RoleServiceImpl implements RoleService {

  private final Mapper<Role> mapper;

  public RoleServiceImpl(Mapper<Role> mapper) {
    this.mapper = mapper;
  }

  @Override
  public Mapper<Role> getMapper() {
    return mapper;
  }
}
