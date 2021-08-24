package com.enginer.app.controller.impl;

import com.enginer.app.controller.UserAddController;
import com.enginer.app.pojo.UserAddEntity.UserAddDtoReq;
import com.enginer.app.pojo.UserAddEntity.UserAddDtoRsp;
import com.enginer.app.service.UserAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author 杜宇飞
 * @Description: UserAddControllerImpl接口实现类
 * @date 2021年08月22日 -- 14:34
 * @cpoyright: 湖北软帝科技有限公司
 ***/
public class UserAddControllerImpl implements UserAddController {

    @Autowired
    public UserAddService userAddService;

    @Override
    @Transactional
    public ResponseEntity<UserAddDtoRsp> getUserApply(@RequestBody @Valid RequestEntity<UserAddDtoReq> requestMessage) {
        String serialNumber = requestMessage.getBody().getSerialNumber();
        UserAddDtoRsp responseMessage = userAddService.getUserAddService(serialNumber);
        return new ResponseEntity<UserAddDtoRsp>(responseMessage, HttpStatus.OK);
    }
}
