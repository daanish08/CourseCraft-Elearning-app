package com.ford.service;

import com.ford.entity.Admin;
import com.ford.respository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    IAdminRepository adminRepository;


    public ResponseEntity<String> addAdmin(Admin admin) {
       try{
           System.out.println(admin);
           Admin newAdmin = adminRepository.save(admin);
           return ResponseEntity.status(HttpStatus.CREATED).body(newAdmin.toString()+" ADDED SUCCESFULLY");
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
       }
    }

    @Override
    public String deleteAdmin(int id) {
        return "";
    }

    @Override
    public String updateAdmin(Admin admin) {
        return "";
    }
}
