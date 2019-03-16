package cn.feng.dao.mapper;

import cn.feng.dao.model.CCurrency;
import cn.feng.dao.model.CCurrencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCurrencyMapper {
    long countByExample(CCurrencyExample example);

    int deleteByExample(CCurrencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CCurrency record);

    int insertSelective(CCurrency record);

    List<CCurrency> selectByExample(CCurrencyExample example);

    CCurrency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CCurrency record, @Param("example") CCurrencyExample example);

    int updateByExample(@Param("record") CCurrency record, @Param("example") CCurrencyExample example);

    int updateByPrimaryKeySelective(CCurrency record);

    int updateByPrimaryKey(CCurrency record);
}