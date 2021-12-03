package com.offcn.service;

import com.github.pagehelper.PageInfo;
        import com.offcn.bean.Movietable;

public interface MovieService {
    /**
     *分页条件查询
     * @param movietable
     * @return
     */
    public PageInfo<Movietable> findByPage(Movietable movietable);
}
