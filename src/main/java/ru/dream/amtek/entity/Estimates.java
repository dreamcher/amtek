package ru.dream.amtek.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.dream.amtek.dto.EstimateDTO;

import java.util.Date;
import java.util.List;

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
    private String grade;
    private Integer total_trim;
    @ManyToOne
    @JoinColumn(name = "subjects_id")
    private Subjects subjects;

}
