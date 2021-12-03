package com.offcn.service;

import com.offcn.bean.TblUser;
import com.offcn.util.BaseResult;

public interface UserSerivice {
    /**
     * 注册用户
     * @param user
     * @return
     */
    public BaseResult regist(TblUser user);

    /**
     * 登录校验
     * @param user
     * @return
     */

public BaseResult loginCheck(TblUser user);


}
