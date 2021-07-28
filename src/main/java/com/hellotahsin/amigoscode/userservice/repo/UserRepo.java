package com.hellotahsin.amigoscode.userservice.repo;

import com.hellotahsin.amigoscode.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
