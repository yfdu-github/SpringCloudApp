package com.engineer.app.database;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.sql.SqlHelper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.awt.event.KeyAdapter;
import java.io.Serializable;
import java.util.List;

/**
 * @author 杜宇飞
 * @Description: dao层实现工具类
 * @date 2021年11月27日 -- 16:37
 * @cpoyright: 湖北软帝科技有限公司
 ***/
public class BaseDao<M extends BaseMapper<E>, E extends Object> extends ServiceImpl {

    @Override
    public boolean saveOrUpdate(Object entity) {
        // 生成流水号

        return super.saveOrUpdate(entity);
    }

    // 根据主键ID获取实体, 查询结果为null则抛出异常
    public Object findOne(Serializable id) {
        Object entity = getById(id);
        if(entity == null) {
            throw new NullPointerException("NullPointerException");
        }
        return entity;
    }

    public Object findOne(QueryWrapper<Object> queryWrapper) {
        IPage<Object> page = new IPage<Object>() {
            @Override
            public List<Object> getRecords() {

                return null;
            }

            @Override
            public IPage<Object> setRecords(List<Object> records) {
                return null;
            }

            @Override
            public long getTotal() {
                return 0;
            }

            @Override
            public IPage<Object> setTotal(long total) {
                return null;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public IPage<Object> setSize(long size) {
                return null;
            }

            @Override
            public long getCurrent() {
                return 0;
            }

            @Override
            public IPage<Object> setCurrent(long current) {
                return null;
            }
        };

        return SqlHelper.getObject(page.getRecords());
    }
}
