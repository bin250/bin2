package com.offcn.service;

import com.offcn.bean.CategroyTop;
import com.offcn.bean.DataBean;
import com.offcn.dao.CategroymovietableMapper;
import com.offcn.dao.MovietableMapper;
import com.offcn.dao.PerformerdetailtableMapper;
import com.offcn.dao.TblUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{
    @Autowired
    private MovietableMapper movietableMapper;
    @Autowired
    private PerformerdetailtableMapper performerdetailtableMapper;
    @Autowired
    private TblUserMapper tblUserMapper;
    @Autowired
    private CategroymovietableMapper categroymovietableMapper;
    @Override
    public DataBean queryData(){
        DataBean dataBean=new DataBean();
        //电影总数
        long movieCouont =movietableMapper.countByExample(null);
        dataBean.setMovienum(movieCouont);
        //演员总数
        long performerCount=performerdetailtableMapper.countByExample(null);
        dataBean.setperformernum(performerCount);
        //用户总数
        long userCount = tblUserMapper.countByExample(null);
        dataBean.setUsernum(userCount);
        //分类总数
        long categroyCount = categroymovietableMapper.countByExample(null);
        dataBean.setCategroynum(categroyCount);
        //分类占比统计
        List<CategroyTop> categroyTopList=categroymovietableMapper.getCategroyTopList();
        dataBean.setTops(categroyTopList);
        return dataBean;
    }


}
