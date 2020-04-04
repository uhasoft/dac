package com.uhasoft.dac.controller;

import com.uhasoft.dac.entity.Role;
import com.uhasoft.dac.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weihua
 * @since 1.0.0
 */
@RestController
@RequestMapping("role")
public class RoleController extends BaseController<Role> {

  private final RoleService service;

  public RoleController(RoleService service) {
    this.service = service;
  }
}
