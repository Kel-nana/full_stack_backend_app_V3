package com.kel.full_stack_backend_app_V3.repository;

import com.kel.full_stack_backend_app_V3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
