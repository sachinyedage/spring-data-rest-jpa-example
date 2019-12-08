package com.javaport.repository;

import com.javaport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRespository extends JpaRepository<User, Long>{

    User findByName(String name);
}
