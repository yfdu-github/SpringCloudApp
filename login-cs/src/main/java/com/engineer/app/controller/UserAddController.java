package com.enginer.app.controller;

import com.enginer.app.pojo.UserAddEntity.UserAddDtoReq;
import com.enginer.app.pojo.UserAddEntity.UserAddDtoRsp;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年08月22日 -- 14:23
 * @cpoyright: 湖北软帝科技有限公司
 ***/
@Component
@RestController
public interface UserAddController {

    @RequestMapping(value = "/useradd", name = "添加用户", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserAddDtoRsp> addUserApply(@RequestBody @Valid RequestEntity<UserAddDtoReq> requestMessage);
}
