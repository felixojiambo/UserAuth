package com.zep.UserAuth.Token;


import com.zep.UserAuth.models.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.time.Instant;
import java.util.Date;

@Service
public class JwtTokenProvider {
    private final Key secretKey = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);

    public String generateToken(User user) {
        // Use Instant for setting issuedAt and expiration
        Instant now = Instant.now();
        Instant expiryDate = now.plusSeconds(3600); // 1 hour

        return Jwts.builder()
                .setSubject(user.getEmail())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(expiryDate))
                .signWith(secretKey)
                .compact();
    }
}
