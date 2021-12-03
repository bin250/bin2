package com.offcn.dao;

import com.offcn.bean.Categroymovietable;
import com.offcn.bean.CategroymovietableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategroymovietableMapper {
    long countByExample(CategroymovietableExample example);

    int deleteByExample(CategroymovietableExample example);

    int deleteByPrimaryKey(Integer numid);

    int insert(Categroymovietable record);

    int insertSelective(Categroymovietable record);

    List<Categroymovietable> selectByExample(CategroymovietableExample example);

    Categroymovietable selectByPrimaryKey(Integer numid);

    int updateByExampleSelective(@Param("record") Categroymovietable record, @Param("example") CategroymovietableExample example);

    int updateByExample(@Param("record") Categroymovietable record, @Param("example") CategroymovietableExample example);

    int updateByPrimaryKeySelective(Categroymovietable record);

    int updateByPrimaryKey(Categroymovietable record);
}