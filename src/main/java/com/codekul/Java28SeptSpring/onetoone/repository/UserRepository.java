package com.codekul.Java28SeptSpring.onetoone.repository;

import com.codekul.Java28SeptSpring.onetoone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
