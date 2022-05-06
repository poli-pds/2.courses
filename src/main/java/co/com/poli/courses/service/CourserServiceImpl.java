package co.com.poli.courses.service;

import co.com.poli.courses.persistence.entity.Course;
import co.com.poli.courses.persistence.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourserServiceImpl implements CourseService {

    private final CourseRepository repository;

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course save(Course course) {
        return repository.save(course);
    }
}
