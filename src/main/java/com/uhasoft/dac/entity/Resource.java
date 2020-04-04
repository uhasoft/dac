package com.uhasoft.dac.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Data
@Table(name = "t_resource")
public class Resource extends BaseEntity {

  private String name;
  private String alias;
}
