package com.ncptest.repository;

import com.ncptest.domain.TestTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestTable1Repository extends JpaRepository<TestTable1, Integer> {
    List<TestTable1> findAll();
}
