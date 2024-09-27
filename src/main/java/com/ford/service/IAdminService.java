package com.ford.service;

import com.ford.entity.Admin;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface IAdminService {
    public ResponseEntity<String> addAdmin(Admin admin);
    public String deleteAdmin(int id);
    public String updateAdmin(Admin admin);
}
