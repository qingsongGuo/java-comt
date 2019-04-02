package com.example.hm.repository;

import com.example.hm.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Integer> {

}
