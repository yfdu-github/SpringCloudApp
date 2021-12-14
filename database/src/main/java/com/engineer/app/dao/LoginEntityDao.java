/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 20:21
 * @cpoyright: 湖北软帝科技有限公司
 ***/
package com.engineer.app.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.engineer.app.cs.dto.logindto.LoginListReq;
import com.engineer.app.database.BaseDao;
import com.engineer.app.entity.LoginEntity;
import com.engineer.app.mapper.LoginEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginEntityDao extends BaseDao<LoginEntityMapper, LoginEntity> {

    @Autowired
    private LoginEntityMapper loginEntityMapper;

    // 通过customerId查询客户全部信息
    public LoginEntity SelectByCustomerId(String customerId) {
        QueryWrapper<LoginEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("customerId",customerId);
        return loginEntityMapper.selectOne(queryWrapper);
    }

    public List<LoginEntity> SelectLoginList(String serialNo) {
        QueryWrapper<LoginEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("serialNo", serialNo);
        List<LoginEntity> loginEntityList = this.list(queryWrapper);
        return loginEntityList;
    }
}
