package com.offcn.service;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.Performerdetailtable;

public interface PerformerService {
    /**
     * 分页查询演员列表
     */

    public PageInfo<Performerdetailtable> findByPage(Performerdetailtable performerdetailtable);

}
