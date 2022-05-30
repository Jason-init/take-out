package com.qizhang.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qizhang.reggie.entity.Employee;
import com.qizhang.reggie.mapper.EmployeeMapper;
import com.qizhang.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author QiZhang
 * @date 2022/5/24
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
