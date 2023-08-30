package com.springboot.springdemo.Services;

import com.springboot.springdemo.Entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentServices {
    public Department saveDepartment(Department department);
}
