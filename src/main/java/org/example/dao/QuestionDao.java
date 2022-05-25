package org.example.dao;

import org.example.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
public interface QuestionDao extends JpaRepository<Question, Integer> {
}
