package com.offcn.service;

import com.offcn.bean.TblUser;
import com.offcn.bean.TblUserExample;

import com.offcn.dao.TblUserMapper;
import com.offcn.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserSerivice {
    //自动注入user持久层实例
    @Autowired
    private TblUserMapper userMapper;

    @Override
    public BaseResult regist(TblUser user) {
        BaseResult result = new BaseResult();
        //校验用户名是否已经被注册
        TblUserExample userExample = new TblUserExample();
        TblUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<TblUser> users = userMapper.selectByExample(userExample);
        if (users != null && users.size() > 0) {
            result.setSuccess(false);
            result.setMessage("该账户以注册");
            return result;
        }
        try {
            userMapper.insert(user);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("注册失败");
        }
        return result;
    }


    @Override
    public BaseResult loginCheck(TblUser user) {
        BaseResult result = new BaseResult();
        TblUserExample userExample = new TblUserExample();
        TblUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andUsernameEqualTo((user.getPassword()));
        List<TblUser> tblUsers = userMapper.selectByExample(userExample);
        if (tblUsers != null && tblUsers.size() > 0) {
            result.setSuccess(true);
            result.setMessage("登录成功");
        } else {
            result.setSuccess(false);
            result.setMessage("登录失败");
        }
        return result;
    }
}
