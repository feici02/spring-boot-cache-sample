package com.example.springbootcachesample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    @Cacheable(value = "employees", key = "#id")
    public Optional<Employee> getEmployeeById(int id) {
        log.info("in getEmployeeById(): {}", id);
        return employeeRepository.findById(id);
    }

    @Override
    @CacheEvict(value = "employees", allEntries = true)
    public void clearCache() {
        log.info("in EmployeeService, clear cache...");
    }
}
