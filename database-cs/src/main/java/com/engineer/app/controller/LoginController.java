/**
 * @author 杜宇飞
 * @Description: 登录信息接口
 * @date 2021年11月26日 -- 19:10
 * @cpoyright: 湖北软帝科技有限公司
 ***/
package com.engineer.app.controller;

import com.engineer.app.cs.dto.logindto.LoginListReq;
import com.engineer.app.cs.dto.logindto.LoginListRsp;
import com.engineer.app.cs.dto.logindto.LoginReq;
import com.engineer.app.cs.dto.logindto.LoginRsp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@Component
@RestController
//@FeignClient(value = "${Spring.application.other-server.Database-server.name:Database-server}", path =
//        "${spring.application.other-server.Database-server.context-path:/Database-server}", contextId = "Database-server-DatabaseClient")
public interface LoginController {

    @PostMapping(value = "/login/inforquery", name = "个人登录信息查询", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginRsp> loginQuery(@RequestBody @Valid RequestEntity<LoginReq> requestMessage);

    @PostMapping(value = "/login/inforsave", name = "个人登录信息保存", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> loginSave(@RequestBody @Valid RequestEntity<LoginRsp> requestMessage);

    @PostMapping(value = "/login/infordelete", name = "个人登录信息删除", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> loginDelete(@RequestBody @Valid RequestEntity<LoginReq> requestMessage);

    @PostMapping(value = "/login/inforlistquery", name = "个人登录信息列表查询", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginListRsp> loginListQuery(@RequestBody @Valid RequestEntity<LoginListReq> requestMessage);
}
