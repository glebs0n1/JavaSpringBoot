package com.example.weplatform.repository;

import com.example.weplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String firstName);

    @Query("SELECT u FROM User u WHERE u.lastName = :lastName")
    List<User> findUsersByLastName(@Param("lastName") String lastName);
}
