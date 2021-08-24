package com.enginer.app.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.enginer.app.entity.UserAddEntity;
import com.enginer.app.mapper.UserAddEntityMapper;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author 杜宇飞
 * @Description: UserAddEntityDao
 * @date 2021年08月22日 -- 14:00
 * @cpoyright: 湖北软帝科技有限公司
 ***/
public class UserAddEntityDao implements UserAddEntityMapper{

    @Override
    public int insert(UserAddEntity entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<UserAddEntity> queryWrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return 0;
    }

    @Override
    public int updateById(UserAddEntity entity) {
        return 0;
    }

    @Override
    public int update(UserAddEntity entity, Wrapper<UserAddEntity> updateWrapper) {
        return 0;
    }

    @Override
    public UserAddEntity selectById(Serializable id) {
        return null;
    }

    @Override
    public List<UserAddEntity> selectBatchIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<UserAddEntity> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public UserAddEntity selectOne(Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<UserAddEntity> selectList(Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<UserAddEntity> selectPage(IPage<UserAddEntity> page, Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage<UserAddEntity> page, Wrapper<UserAddEntity> queryWrapper) {
        return null;
    }
}
