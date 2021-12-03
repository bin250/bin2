package com.offcn.dao;

import com.offcn.bean.Moviedetailtable;
import com.offcn.bean.MoviedetailtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoviedetailtableMapper {
    long countByExample(MoviedetailtableExample example);

    int deleteByExample(MoviedetailtableExample example);

    int insert(Moviedetailtable record);

    int insertSelective(Moviedetailtable record);

    List<Moviedetailtable> selectByExample(MoviedetailtableExample example);

    int updateByExampleSelective(@Param("record") Moviedetailtable record, @Param("example") MoviedetailtableExample example);

    int updateByExample(@Param("record") Moviedetailtable record, @Param("example") MoviedetailtableExample example);
}