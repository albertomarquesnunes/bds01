package com.devsuperior.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds01.entities.Employee;

public interface EmployRepository extends JpaRepository<Employee, Long> {

}
