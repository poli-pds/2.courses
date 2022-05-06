package co.com.poli.courses.service;

import co.com.poli.courses.persistence.entity.Instructor;
import co.com.poli.courses.persistence.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImp implements InstructorService {

    private final InstructorRepository repository;

    @Override
    public List<Instructor> findAll() {
        return repository.findAll();
    }

    @Override
    public Instructor save(Instructor instructor) {
        return repository.save(instructor);
    }
}
