package org.gvozdetscky.logistic.repository;

import org.gvozdetscky.logistic.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
