package com.semenov.lavka.repository;

import com.semenov.lavka.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Для Spring Security что бы он искал пользователей по email
     */
    User findByEmail(String email);

}
