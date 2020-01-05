package com.solt.demo.manytomanydemo.repository;

import com.solt.demo.manytomanydemo.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
