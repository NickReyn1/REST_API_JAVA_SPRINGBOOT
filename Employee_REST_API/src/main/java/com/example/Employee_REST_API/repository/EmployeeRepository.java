package com.example.Employee_REST_API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Employee_REST_API.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
