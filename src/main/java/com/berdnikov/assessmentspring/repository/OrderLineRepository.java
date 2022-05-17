package com.berdnikov.assessmentspring.repository;

import com.berdnikov.assessmentspring.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderLineRepository")
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

    
}
