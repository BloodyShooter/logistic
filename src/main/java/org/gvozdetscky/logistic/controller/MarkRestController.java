package org.gvozdetscky.logistic.controller;

import org.gvozdetscky.logistic.domain.Mark;
import org.gvozdetscky.logistic.repository.MarkRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepository> {
    public MarkRestController(MarkRepository repository) {
        super(repository);
    }
}
