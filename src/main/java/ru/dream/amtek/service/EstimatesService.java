package ru.dream.amtek.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dream.amtek.dto.EstimateDTO;
import ru.dream.amtek.entity.Estimates;
import ru.dream.amtek.repository.EstimatesRepository;
import ru.dream.amtek.repository.SubjectsRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EstimatesService {

    private final EstimatesRepository estimatesRepository;
    private final SubjectsService subjectsService;


    public Estimates create(EstimateDTO dto) {
        return estimatesRepository.save(Estimates.builder()
                .date(dto.getDate())
                .grade(dto.getGrade())
                .totaltrim(dto.getTotaltrim())
                .subjects(subjectsService.readById(dto.getSubjectsId()))
                .build());
    }

    public List<Estimates> readAll() {
        return estimatesRepository.findAll();
    }


    public void delete(Long id) {
        estimatesRepository.deleteById(id);
    }

    public List<Estimates> readBySubjectsId(Long id) {
        return estimatesRepository.findBySubjectsId(id);
    }

}
