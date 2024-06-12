package com.truenorthit.springssojwtdemo.app1.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class JwtTokenGenerator {
    private static final String SECRET_KEY = "my_secret_key";
    private static final String ISSUER = "app1";
    private static final String AUDIENCE = "app2";

    public static String generateToken(String userEmail) {
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        return JWT.create()
                .withIssuer(ISSUER)
                .withAudience(AUDIENCE)
                .withSubject(userEmail)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + 600000)) // 10 minutes expiry
                .sign(algorithm);
    }
}
