package net.javaguides.springBoot.repository;

import net.javaguides.springBoot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
// all CRUD methode
}
