package ru.dream.amtek.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dream.amtek.dto.EstimateDTO;
import ru.dream.amtek.entity.Estimates;
import ru.dream.amtek.service.EstimatesService;

import java.util.List;

@RestController
@RequestMapping("/estimates")
@AllArgsConstructor
public class EstimatesController {

    private final EstimatesService estimatesService;

    @PostMapping
    public ResponseEntity<Estimates> create(@RequestBody EstimateDTO dto) {
        return mappingResponseEstimates(estimatesService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<Estimates>> readAll() {
        return mappingResponseListEstimates(estimatesService.readAll());
    }

    @GetMapping("/subjects/{id}")
    public ResponseEntity<List<Estimates>> readBySubjectId(@PathVariable Long id) {
        return mappingResponseListEstimates(estimatesService.readBySubjectsId(id));
    }


    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        estimatesService.delete(id);
        return HttpStatus.OK;
    }

    private ResponseEntity<Estimates> mappingResponseEstimates(Estimates product) {
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    private ResponseEntity<List<Estimates>> mappingResponseListEstimates(List<Estimates> products) {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
