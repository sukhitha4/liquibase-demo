package com.captains.util;

import com.captains.dto.PostingDto;
import com.captains.entity.Posting;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PostingMapper {
    Posting toPostingEntity(PostingDto posting);
    PostingDto toPostingDto(Posting posting);
}
