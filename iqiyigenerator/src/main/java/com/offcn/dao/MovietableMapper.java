package com.offcn.dao;

import com.offcn.bean.Movietable;
import com.offcn.bean.MovietableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovietableMapper {
    long countByExample(MovietableExample example);

    int deleteByExample(MovietableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Movietable record);

    int insertSelective(Movietable record);

    List<Movietable> selectByExample(MovietableExample example);

    Movietable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Movietable record, @Param("example") MovietableExample example);

    int updateByExample(@Param("record") Movietable record, @Param("example") MovietableExample example);

    int updateByPrimaryKeySelective(Movietable record);

    int updateByPrimaryKey(Movietable record);
}