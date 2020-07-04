package co.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.demo.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
