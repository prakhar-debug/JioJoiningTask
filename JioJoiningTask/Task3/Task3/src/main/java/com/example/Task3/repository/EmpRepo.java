package com.example.Task3.repository;

import com.example.Task3.entity.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity,Integer> {
    Optional<EmpEntity> findByName(String name);
}
