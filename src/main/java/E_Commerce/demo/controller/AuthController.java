package E_Commerce.demo.controller;

import E_Commerce.demo.dto.request.RegisterRequest;
import E_Commerce.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterRequest registerRequest){
        return service.registerUser(registerRequest);
    }
}
