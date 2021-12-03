package com.offcn.service;

import com.offcn.bean.DataBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface DataService {
    public DataBean queryData();
}
