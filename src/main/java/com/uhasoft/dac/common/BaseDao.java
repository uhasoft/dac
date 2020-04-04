package com.uhasoft.dac.common;

import com.uhasoft.dac.entity.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Weihua
 * @since 1.0.0
 */
public interface BaseDao<T extends BaseEntity> extends Mapper<T> {
}
