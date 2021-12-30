package com.codekul.Java28SeptSpring.onetoone.repository;

import com.codekul.Java28SeptSpring.onetoone.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address,Integer> {
}
