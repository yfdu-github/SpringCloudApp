/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 20:17
 * @cpoyright: 湖北软帝科技有限公司
 ***/
package com.engineer.app.controller.impl;

import com.engineer.app.controller.LoginController;
import com.engineer.app.cs.dto.logindto.LoginListReq;
import com.engineer.app.cs.dto.logindto.LoginListRsp;
import com.engineer.app.cs.dto.logindto.LoginReq;
import com.engineer.app.cs.dto.logindto.LoginRsp;
import com.engineer.app.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class LoginControllerImpl implements LoginController {

    @Autowired
    private LoginService loginService;

    @Override
    @Transactional
    public ResponseEntity<LoginRsp> loginQuery(@RequestBody @Valid RequestEntity<LoginReq> requestMessage) {
        LoginReq loginReq = requestMessage.getBody();
        LoginRsp loginRsp = loginService.LoginQueryService(loginReq);
        return new ResponseEntity<>(loginRsp, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<Boolean> loginSave(@RequestBody @Valid RequestEntity<LoginRsp> requestMessage) {
        LoginRsp loginRsp = requestMessage.getBody();
        Boolean flag = loginService.LoginSaveService(loginRsp);
        return new ResponseEntity<>(flag, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<Boolean> loginDelete(@RequestBody @Valid RequestEntity<LoginReq> requestMessage) {
        LoginReq loginReq = requestMessage.getBody();
        Boolean flag = loginService.LoginDeleteService(loginReq);
        return new ResponseEntity<>(flag, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<LoginListRsp> loginListQuery(@RequestBody @Valid RequestEntity<LoginListReq> requestMessage) {
        LoginListReq loginListReq = requestMessage.getBody();
        LoginListRsp loginListRsp = loginService.loginQueryListService(loginListReq);
        return new ResponseEntity<>(loginListRsp, HttpStatus.OK);
    }
}
