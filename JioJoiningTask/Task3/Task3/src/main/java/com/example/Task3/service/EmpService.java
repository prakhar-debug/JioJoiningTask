package com.example.Task3.service;

import com.example.Task3.entity.EmpEntity;
import com.example.Task3.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public EmpEntity saveEmp(EmpEntity empEntity){
       return empRepo.save(empEntity);
    }

    public List<EmpEntity> getAllEmp(){
        return empRepo.findAll();
    }

    public Optional<EmpEntity> getAllEmpById(int id){
        return empRepo.findById(id);
    }
    public Optional<EmpEntity> getAllEmpByName(String name){
        return empRepo.findByName(name);
    }
    public String deleteEmp(int id){
        empRepo.deleteById(id);
        return "Employee is deleted";
    }

}
