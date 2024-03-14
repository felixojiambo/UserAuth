package com.zep.UserAuth.controllers;
import com.zep.UserAuth.dtos.LoginRequest;
import com.zep.UserAuth.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        String jwtToken = loginService.authenticateUser(loginRequest);
        return ResponseEntity.ok(jwtToken);
    }
}
