package co.com.poli.courses.controller;

import co.com.poli.courses.persistence.entity.Course;
import co.com.poli.courses.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @GetMapping
    public List<Course> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return service.save(course);
    }

}
