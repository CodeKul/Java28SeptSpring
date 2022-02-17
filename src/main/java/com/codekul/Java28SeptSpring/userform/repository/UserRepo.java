package com.codekul.Java28SeptSpring.userform.repository;

import com.codekul.Java28SeptSpring.userform.domain.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserForm,Integer> {
}
