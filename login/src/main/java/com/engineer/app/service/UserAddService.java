package com.enginer.app.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enginer.app.dao.UserAddEntityDao;
import com.enginer.app.entity.UserAddEntity;
import com.enginer.app.pojo.UserAddEntity.UserAddDto;
import com.enginer.app.pojo.UserAddEntity.UserAddDtoRsp;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.validation.Valid;

/**
 * @author 杜宇飞
 * @Description: UserAddService逻辑业务层
 * @date 2021年08月22日 -- 14:37
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Slf4j
@Service
public class UserAddService extends ServiceImpl {

    @Autowired
    public UserAddEntityDao userAddEntityDao;

    @Transactional
    public UserAddDtoRsp getUserAddService(String serialNumber) {
        UserAddEntity userAddEntity = userAddEntityDao.selectById(serialNumber);
        BeanUtils.copyProperties(userAddEntity, UserAddDtoRsp.class);
        return new UserAddDtoRsp();
    }

    @Transactional
    public UserAddDto saveUserAddService(@Valid UserAddDto userAddDto) {
        UserAddEntity userAddEntity = null;
        if(!StringUtils.isEmpty(userAddDto.getSerialNumber())) {
            userAddEntity = userAddEntityDao.selectById(userAddDto.getSerialNumber());
        }
        if(userAddEntity == null) {
            userAddEntity = new UserAddEntity();
        }
        BeanUtils.copyProperties(userAddDto, userAddEntity);
        ServiceImpl service = new ServiceImpl();
        service.saveOrUpdate(userAddEntity);
        return userAddDto;
    }
}
