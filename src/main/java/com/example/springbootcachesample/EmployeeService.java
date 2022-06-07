package com.example.springbootcachesample;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getEmployeeById(int id);
    void clearCache();
}
