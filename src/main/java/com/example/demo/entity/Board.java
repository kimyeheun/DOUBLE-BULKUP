package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    private String boardTitle;
    private LocalDateTime createdDate;
    private String boardContent;
    private Integer boardLike;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
