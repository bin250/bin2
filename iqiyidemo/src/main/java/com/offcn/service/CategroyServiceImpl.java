package com.offcn.service;

import com.offcn.bean.Categroymovietable;
import com.offcn.dao.CategroymovietableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategroyServiceImpl implements CategroyService{
    @Autowired
    private CategroymovietableMapper categroymovietableMapper;
    @Override
    public List<String> getCategroyNameList(){
        List<Categroymovietable>categroymovietables=categroymovietableMapper.selectByExample(null);
        List<String>categoryNames=new ArrayList<>();
        for(Categroymovietable categroymovietable:categroymovietables) {
            categoryNames.add(categroymovietable.getTitle());
        }
        return  categoryNames;
    }


}
