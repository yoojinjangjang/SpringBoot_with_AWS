package com.jojoldu.book.springbootaws.web.dto;

import com.jojoldu.book.springbootaws.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title,String content, String author){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Posts toEntity(){
        return Posts.builder()
                .author(this.author)
                .title(this.title)
                .content(this.content)
                .build();
    }
}
