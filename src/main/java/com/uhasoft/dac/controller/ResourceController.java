package com.uhasoft.dac.controller;

import com.uhasoft.dac.entity.Resource;
import com.uhasoft.dac.service.ResourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weihua
 * @since 1.0.0
 */
@RestController
@RequestMapping("resource")
public class ResourceController extends BaseController<Resource> {

  private final ResourceService service;

  public ResourceController(ResourceService service) {
    this.service = service;
  }
}
