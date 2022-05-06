package com.berdnikov.assessmentspring.repository;

import com.berdnikov.assessmentspring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository ("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
