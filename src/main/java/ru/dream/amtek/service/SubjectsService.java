package ru.dream.amtek.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dream.amtek.dto.SubjectsDTO;
import ru.dream.amtek.entity.Subjects;
import ru.dream.amtek.repository.SubjectsRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SubjectsService {

    private final SubjectsRepository subjectsRepository;



    public Subjects create(SubjectsDTO dto) {
        return subjectsRepository.save(Subjects.builder()
                .name(dto.getName())
                .build());
    }

    public List<Subjects> readAll() {
        return subjectsRepository.findAll();
    }

    public Subjects readById(Long id) {
        return subjectsRepository.findById(id).orElseThrow(() ->
                new RuntimeException("subjects not found - " + id));
    }

}
