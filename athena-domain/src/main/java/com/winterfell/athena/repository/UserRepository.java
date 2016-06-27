package com.winterfell.athena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winterfell.athena.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
