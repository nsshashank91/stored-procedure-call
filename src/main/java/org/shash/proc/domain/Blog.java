package org.shash.proc.domain;

import javax.persistence.*;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long blogId;

    @Column
    private String title;

    @Column
    private Integer yearOfPost;

    public long getBlogId() {
        return blogId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearOfPost() {
        return yearOfPost;
    }
}
