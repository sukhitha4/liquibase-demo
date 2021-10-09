package com.captains.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostingDto {
    private int id;
    private double amount;
    private String status;
    private String timestamp;
    private String notes;
}
