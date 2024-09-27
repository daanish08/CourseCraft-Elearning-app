package com.ford.controller;


import com.ford.entity.Admin;
import com.ford.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/addAdmin")
    public ResponseEntity<String> addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }
}
