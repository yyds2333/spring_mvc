package com.powernode.mapper;

import com.powernode.entity.Standard;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;


public interface StandardMapper {

    /**
     * 全部查询
     * @return
     */
    List<Standard> selectAll();

    /**
     * 条件单个查询
     * @param id
     * @return
     */
    Standard selectById(Integer id);

    /**
     * 条件模糊查询
     * @param zhname
     * @return
     */
    List<Standard> selectCondition(String zhname);

    @Delete("delete from standard where id = #{id}")
    int deleteById(Integer id);

    int insert(Standard standard);

    int update(Standard standard);
}
