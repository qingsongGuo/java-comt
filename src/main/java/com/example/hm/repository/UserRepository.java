package com.example.hm.repository;

import com.example.hm.domain.User;
import org.hibernate.validator.internal.engine.resolver.JPATraversableResolver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

    @Override
    User getOne(Integer integer);

    User findByName(String name);
}
