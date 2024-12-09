package com.ncptest.service;

import com.ncptest.domain.TestTable1;
import com.ncptest.repository.TestTable1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestTable1Service {
    private final TestTable1Repository repository;
    public List<TestTable1> getList(){
        return repository.findAll();
    }

}
