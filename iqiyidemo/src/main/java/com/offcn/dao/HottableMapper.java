package com.offcn.dao;

import com.offcn.bean.Hottable;
import com.offcn.bean.HottableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HottableMapper {
    long countByExample(HottableExample example);

    int deleteByExample(HottableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hottable record);

    int insertSelective(Hottable record);

    List<Hottable> selectByExample(HottableExample example);

    Hottable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hottable record, @Param("example") HottableExample example);

    int updateByExample(@Param("record") Hottable record, @Param("example") HottableExample example);

    int updateByPrimaryKeySelective(Hottable record);

    int updateByPrimaryKey(Hottable record);
}