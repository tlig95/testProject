package com.example.demo.repository;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.DemandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandRepository extends JpaRepository<DemandEntity,Integer>
{
    @Query("SELECT r FROM DemandEntity r where r.user = :id")
    List<DemandEntity> findByIdUser(@Param("id") int id);
}
