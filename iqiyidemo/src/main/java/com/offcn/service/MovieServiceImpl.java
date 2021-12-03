package com.offcn.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.bean.Movietable;
import com.offcn.dao.MovietableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovietableMapper movietableMapper;
    @Override
    public PageInfo<Movietable> findByPage(Movietable movietable){

        if (movietable.getPage()>0&&movietable.getPageSize()>0){
            PageHelper.startPage(movietable.getPage(),movietable.getPageSize());
        }
        List<Movietable> movietables=movietableMapper.selectByExample(null);
        PageInfo<Movietable> pageInfo=new PageInfo<>(movietables);
        return pageInfo;
    }
}
