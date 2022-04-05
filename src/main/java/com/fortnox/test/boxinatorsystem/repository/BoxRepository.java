package com.fortnox.test.boxinatorsystem.repository;

import com.fortnox.test.boxinatorsystem.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box,Integer> {
}
