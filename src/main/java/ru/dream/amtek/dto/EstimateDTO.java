package ru.dream.amtek.dto;

import lombok.Data;


import java.util.Date;

@Data
public class EstimateDTO {

    private Date date;
    private String grade;
    private Integer totaltrim;
    private Long subjectsId;

}

