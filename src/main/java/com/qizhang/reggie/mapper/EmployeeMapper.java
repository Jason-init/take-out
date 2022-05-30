package com.qizhang.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qizhang.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author QiZhang
 * @date 2022/5/24
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
