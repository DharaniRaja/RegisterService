package com.dharani.registerservice.repository;


import com.dharani.registerservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByEmail(String email);
}
