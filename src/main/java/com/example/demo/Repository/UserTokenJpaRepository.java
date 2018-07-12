package com.example.demo.Repository;

import com.example.demo.Entity.UserToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTokenJpaRepository extends JpaRepository<UserToken, String> {

    UserToken findUserTokenByToken(String token);
}
