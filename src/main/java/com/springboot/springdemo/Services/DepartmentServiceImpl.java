package com.springboot.springdemo.Services;

import com.springboot.springdemo.Entity.Department;
import com.springboot.springdemo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentServices{
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
}
