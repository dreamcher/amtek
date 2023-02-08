package ru.dream.amtek.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dream.amtek.dto.SubjectsDTO;
import ru.dream.amtek.entity.Subjects;
import ru.dream.amtek.service.SubjectsService;

import java.util.List;

@RestController
@RequestMapping("/subjects")
@AllArgsConstructor
public class SubjectsController {

    private final SubjectsService subjectsService;

    @GetMapping
    public ResponseEntity<List<Subjects>> readAll() {
        return new ResponseEntity<>(subjectsService.readAll(), HttpStatus.OK);
    }

 /*   @PostMapping
    public ResponseEntity<Subjects> create(@RequestBody SubjectsDTO dto) {
        return mappingResponseSubjects(SubjectsService.create(dto));
    } */

    private ResponseEntity<Subjects> mappingResponseSubjects(Subjects subjects) {
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }

}
