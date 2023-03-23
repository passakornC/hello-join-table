package com.example.demo_join_table.repository;

import com.example.demo_join_table.entity.PackagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagesRepository extends JpaRepository<PackagesEntity, Integer> {
}
