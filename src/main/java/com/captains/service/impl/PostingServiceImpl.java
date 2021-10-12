package com.captains.service.impl;

import com.captains.domain.Posting;
import com.captains.integration.repository.jpa.PostingRepository;
import com.captains.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostingServiceImpl implements PostingService {
    @Autowired
    PostingRepository postingRepository;

    @Override
    public List<Posting> getPostings() {
        return postingRepository.findAll().stream()
                .map(posting -> Posting.builder()
                        .id(posting.getId())
                        .amount(posting.getAmount())
                        .status(posting.getStatus())
                        .timestamp(posting.getTimestamp())
                        .notes(posting.getNotes())
                .build())
                .collect(Collectors.toList());
    }
}
