package com.captains.integration.repository.jpa;

import com.captains.integration.model.entity.PostingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostingRepository extends JpaRepository<PostingEntity, Integer> {
    List<PostingEntity> findAll();
}
