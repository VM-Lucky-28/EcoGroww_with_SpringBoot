package com.example.Farmerproj.repository;

import com.example.Farmerproj.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepo extends JpaRepository<Farmer,Integer> {
}
