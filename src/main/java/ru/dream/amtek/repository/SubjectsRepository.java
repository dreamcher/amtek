package ru.dream.amtek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dream.amtek.entity.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Long> {
}
