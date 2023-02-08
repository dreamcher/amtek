package ru.dream.amtek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dream.amtek.entity.Estimates;
import ru.dream.amtek.entity.Subjects;

import java.util.List;

@Repository
public interface EstimatesRepository extends JpaRepository<Estimates, Long> {

    List<Subjects> findBySubjectsId(Long id);
}
