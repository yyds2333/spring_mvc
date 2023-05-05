package com.powernode.service.impl;

import com.powernode.entity.Standard;
import com.powernode.mapper.StandardMapper;
import com.powernode.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardServiceImpl implements StandardService {

    @Autowired // 自动装配mapper对象
    private StandardMapper mapper;

    @Override
    public List<Standard> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Standard getOneById(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Standard> conGet(String zhname) {
        List<Standard> standards = mapper.selectCondition(zhname);
        return standards;
    }

    @Override
    public int deleteAll(Integer... ids) {
        int sum = 0;
        for (int i = 0; i < ids.length; i++) {
            sum = sum + mapper.deleteById(ids[i]);
        }
        return sum;
    }

    @Override
    public int updateById(Standard standard) {
        int update = mapper.update(standard);
        return update;
    }

    @Override
    public int addOne(Standard standard) {
        int insert = mapper.insert(standard);
        return insert;
    }
}
