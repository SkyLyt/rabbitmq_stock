package com.lyt.rabbitmq_stock.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.lyt.rabbitmq_stock.entity.DispatchEntity;

public interface DispatchMapper {

    /**
     * 新增派单任务
     */
    @Insert("INSERT into platoon values (null,#{orderId},#{takeoutUserId});")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertDistribute(DispatchEntity distributeEntity);

}
