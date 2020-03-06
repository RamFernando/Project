package com.ramesha.ecommerce.productservice.repository;

import com.ramesha.ecommerce.productservice.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
}
