package com.uhasoft.dac.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author Weihua
 * @since 1.0.0
 */
@Data
public class BaseEntity {

  @Id
  private String id;
//  private String tenantId;
  private boolean deleted;
  private Date createdAt;
  private Date lastModifiedAt;
  private String createdBy;
  private String lastModifiedBy;
  private int version;
}
