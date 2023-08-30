package com.springboot.springdemo.Controller;

import com.springboot.springdemo.Entity.Department;
import com.springboot.springdemo.Services.DepartmentServiceImpl;
import com.springboot.springdemo.Services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DepartmentController {
    @Autowired
    private DepartmentServices departmentServices;
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentServices.saveDepartment(department);
    }
}

