package co.com.poli.courses.controller;

import co.com.poli.courses.persistence.entity.Instructor;
import co.com.poli.courses.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService service;

    @GetMapping
    public List<Instructor> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor) {
        return service.save(instructor);
    }

}
