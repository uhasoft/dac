package com.uhasoft.dac.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Data
@Table(name = "t_right")
public class Right extends BaseEntity {

  private String name;
  private String resourceId;
  private String rightType;
  private String limitation;
  private String description;

}
