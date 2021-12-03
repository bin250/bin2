package com.offcn.service;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.ConditionBean;
import com.offcn.bean.Moviedetailtable;
import com.offcn.bean.Movietable;
import com.offcn.util.BaseResult;

public interface MovieTableService {
    /**
     * 新增电影
     * @param movietable
     * @return
     */
    public PageInfo<Movietable>findByPage(Movietable movietable);


    public PageInfo<Movietable> findMoviesByConditionBean(ConditionBean conditionBean);
    public BaseResult addMovie(Movietable movietable,
                               Moviedetailtable moviedetailtable);
}
