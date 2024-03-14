package com.zep.UserAuth.repository;
import com.zep.UserAuth.Token.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}