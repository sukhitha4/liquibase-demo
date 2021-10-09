package com.captains.controller;

import com.captains.dto.PostingDto;
import com.captains.entity.Posting;
import com.captains.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostingController {
    @Autowired
    PostingService postingService;

    @GetMapping("/postings")
    public ResponseEntity<List<PostingDto>> getPostings () {
        return ResponseEntity.status(HttpStatus.OK)
                .body(postingService.getPostings());
    }
}
