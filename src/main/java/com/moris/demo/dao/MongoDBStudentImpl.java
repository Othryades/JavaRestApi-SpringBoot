package com.moris.demo.dao;

import com.moris.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("mongoDbDao")
public class MongoDBStudentImpl implements StudentDao {

//    private final MongoDbTemplate MongoDbTemplate;

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(UUID.randomUUID(), 10, "Mongo",  "DB",  "NoSqlDB"));
        return students;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}
