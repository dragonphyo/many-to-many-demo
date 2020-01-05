package com.solt.demo.manytomanydemo.service;

import com.solt.demo.manytomanydemo.domain.Student;
import com.solt.demo.manytomanydemo.domain.Subject;
import com.solt.demo.manytomanydemo.repository.StudentRepository;
import com.solt.demo.manytomanydemo.repository.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseImpl implements IDatabase {
    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;

    public DatabaseImpl(SubjectRepository subjectRepository, StudentRepository studentRepository) {
        this.subjectRepository = subjectRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        Student s1 = new Student("Thaw Thaw",23,"Latha");
        Student s2 = new Student("Cherry",24,"TTC");
        Student s3 = new Student("Soe Naing",24,"TTC");

        Subject sub1 = new Subject("java",6);
        Subject sub2 = new Subject("Python",7);
        Subject sub3 = new Subject("Grrovy",3);

        sub1.getStudentList().add(s1);
        sub1.getStudentList().add(s2);
        sub1.getStudentList().add(s3);

        sub2.getStudentList().add(s2);
        sub3.getStudentList().add(s3);

//        subjectRepository.save(sub1);
//        subjectRepository.save(sub2);
//        subjectRepository.save(sub3);

          s1.getSubjects().add(sub1);
          s2.getSubjects().add(sub1);
          s3.getSubjects().add(sub1);

          s2.getSubjects().add(sub2);
          s3.getSubjects().add(sub3);

          studentRepository.save(s1);
          studentRepository.save(s2);
          studentRepository.save(s3);

    }
}
