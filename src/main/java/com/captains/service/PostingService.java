package com.captains.service;

import com.captains.dto.PostingDto;
import com.captains.entity.Posting;
import com.captains.repository.PostingRepository;
import com.captains.util.PostingMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostingService {
    @Autowired
    PostingRepository postingRepository;

    private PostingMapper mapper = Mappers.getMapper(PostingMapper.class);

    public List<PostingDto> getPostings() {
//        return postingRepository.findAll().stream()
//                .map(posting -> mapper.toPostingDto(posting))
//                .collect(Collectors.toList());
        return postingRepository.findAll().stream()
                .map(posting -> PostingDto.builder()
                        .id(posting.getId())
                        .amount(posting.getAmount())
                        .status(posting.getStatus())
                        .timestamp(posting.getTimestamp())
//                        .notes(posting.getNotes())
                        .build())
                .collect(Collectors.toList());
    }
}
