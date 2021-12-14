/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 20:19
 * @cpoyright: 湖北软帝科技有限公司
 ***/
package com.engineer.app.service;

import com.engineer.app.cs.dto.logindto.LoginListReq;
import com.engineer.app.cs.dto.logindto.LoginListRsp;
import com.engineer.app.cs.dto.logindto.LoginReq;
import com.engineer.app.cs.dto.logindto.LoginRsp;
import com.engineer.app.dao.LoginEntityDao;
import com.engineer.app.entity.LoginEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class LoginService {

    @Autowired
    private LoginEntityDao loginEntityDao;

    @Transactional
    public LoginRsp LoginQueryService(LoginReq loginReq) {
        LoginRsp loginRsp = new LoginRsp();
        LoginEntity loginEntity = (LoginEntity) loginEntityDao.getById(loginReq.getSerialNo());
        BeanUtils.copyProperties(loginEntity, loginRsp);
        return loginRsp;
    }

    @Transactional
    public Boolean LoginSaveService(LoginRsp loginRsp) {
        // 数据库中有则更新，无则新建
        if(StringUtils.isEmpty(loginRsp)) {
            loginRsp = new LoginRsp();
        }
        return loginEntityDao.saveOrUpdate(loginRsp);
    }

    @Transactional
    public Boolean LoginDeleteService(LoginReq loginReq) {
        return loginEntityDao.removeById(loginReq.getSerialNo());
    }

    @Transactional
    public LoginListRsp loginQueryListService(LoginListReq loginListReq) {
        List<LoginRsp> loginRspList = new ArrayList<>();
        List<LoginEntity> loginEntityList = loginEntityDao.SelectLoginList(loginListReq.getSerialNo());
        BeanUtils.copyProperties(loginEntityList, loginRspList);

        // 返回列表
        LoginListRsp loginListRspList = new LoginListRsp();
        loginListRspList.setTotalCount(loginRspList.size());
        loginListRspList.setLoginRspList(loginRspList);
        return loginListRspList;
    }
}
