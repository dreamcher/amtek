package ru.dream.amtek.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estimates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data;
    private Integer grade;
    private Integer total_trim;
    @ManyToOne
    @JoinColumn(name = "subjects_id")
    private Subjects subjects;

}
