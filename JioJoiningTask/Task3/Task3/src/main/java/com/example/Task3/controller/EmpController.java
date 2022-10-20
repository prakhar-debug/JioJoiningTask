package com.example.Task3.controller;

import com.example.Task3.entity.EmpEntity;
import com.example.Task3.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;
    @PostMapping("/save")
    public EmpEntity addEmpl(@RequestBody EmpEntity empEntity){
        return empService.saveEmp(empEntity);
    }

    @GetMapping("/getEmp")
    public List<EmpEntity> findAllEmp()
    {
        return empService.getAllEmp();
    }
    @GetMapping("/getEmp/id/{id}")
    public Optional<EmpEntity> findAllEmpById(@PathVariable int id)
    {
        return empService.getAllEmpById(id);
    }
    @GetMapping("/getEmp/name/{name}")
    public Optional<EmpEntity> findAllEmpByName(@PathVariable String name)
    {
        return empService.getAllEmpByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmpById(@PathVariable int id)
    {
        return empService.deleteEmp(id);
    }


}
