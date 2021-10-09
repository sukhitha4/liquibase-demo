package com.captains.repository;

import com.captains.entity.Posting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostingRepository extends JpaRepository<Posting, Integer> {
    List<Posting> findAll();
}
