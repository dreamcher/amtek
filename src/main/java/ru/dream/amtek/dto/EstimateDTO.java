package ru.dream.amtek.dto;

import lombok.Data;
import ru.dream.amtek.entity.Subjects;

import java.util.Date;

@Data
public class EstimateDTO {

    private Long id;
    private Date data;
    private String grade;
    private Integer total_trim;
    private Subjects subjects;

}
