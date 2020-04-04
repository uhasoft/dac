package com.uhasoft.dac.controller;

import com.uhasoft.dac.entity.Right;
import com.uhasoft.dac.service.RightService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weihua
 * @since 1.0.0
 */
@RestController
@RequestMapping("right")
public class RightController extends BaseController<Right> {

  private final RightService service;

  public RightController(RightService service) {
    this.service = service;
  }
}
