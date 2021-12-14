package com.engineer.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.engineer.app.entity.LoginEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 20:21
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Mapper
public interface LoginEntityMapper extends BaseMapper<LoginEntity> {

    @Select("SELECT SERIALNO, CUSTOMERID, NETPASSWORD, SEATNO, STARTPASSWORD, INTERNETADDRESS, INPUTUSERID, " +
            "INPUTTIME, UPDATEUSERID, UPDATEYIME FROM LOGIN")
    <E extends IPage<Object>> E selectLoginList(E page, @Param(Constants.WRAPPER) Wrapper queryWrapper);
}
