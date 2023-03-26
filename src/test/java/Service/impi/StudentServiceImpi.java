/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impi;

import Entity.Student;
import Repository.StudentRepository;
import Service.StudentService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class StudentServiceImpi implements StudentService{

    /**
     * @param StudentRepository the StudentRepository to set
     */
    public StudentServiceImpi(StudentRepository StudentRepository) {
        super();
        this.StudentRepository = StudentRepository;
    }
    
    private StudentRepository StudentRepository;

    @Override
    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }
    
}
