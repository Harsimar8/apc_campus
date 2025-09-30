package com.example.campus.repository;

import com.example.campus.entity.Assignment;  // ✅ import from entity package
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByCreatedBy(String facultyName);
    List<Assignment> findByStudentId(Long studentId);
}
