package com.hellotahsin.amigoscode.userservice.repo;

import com.hellotahsin.amigoscode.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
