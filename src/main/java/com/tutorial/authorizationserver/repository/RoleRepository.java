package com.tutorial.authorizationserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.authorizationserver.entity.Role;
import com.tutorial.authorizationserver.enums.RoleName;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Optional<Role> findByRole(RoleName roleName);
}
