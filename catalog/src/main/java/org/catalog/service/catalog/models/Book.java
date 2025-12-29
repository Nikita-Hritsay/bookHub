package org.catalog.service.catalog.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@With
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "book")
public class Book extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private LocalDateTime publishedDate;

    @Column(nullable = false)
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Author author;

    @Column(nullable = false)
    private Status status;

}
