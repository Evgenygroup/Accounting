package com.school.project.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "LESSON")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "THEMA", nullable = false)
    private String thema;

    @OneToMany(targetEntity = Subject.class)
    @JoinTable(name = "LESSON_SUBJECT", joinColumns = {@JoinColumn(name = "LESSON_ID")},
            inverseJoinColumns = {@JoinColumn(name = "SUBJECT_ID")})
    private List<Subject> subjects;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LESSON_DATE", nullable = false)
    private Date date;

    @OneToOne
    @JoinColumn(name = "GROUP_ID", nullable = false)
    private Group group;

    @OneToOne
    @JoinColumn(name = "TEACHER_ID", nullable = false)
    private User teacher;

}
