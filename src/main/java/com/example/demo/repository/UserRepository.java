package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(
            value = "select * from test.user where user_id= :userId",
            nativeQuery = true
    )
    User findByUserId(@Param("userId") String userId);
    // 추가적인 쿼리 메서드 선언 가능
}