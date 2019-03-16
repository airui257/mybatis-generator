package com.fen.dao.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @description:
 * @author: lrf
 * @create: 2019-03-16
 **/
public interface PowerMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
