package com.alencar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alencar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
