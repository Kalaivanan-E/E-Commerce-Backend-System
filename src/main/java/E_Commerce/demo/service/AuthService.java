package E_Commerce.demo.service;

import E_Commerce.demo.dto.request.LoginRequest;
import E_Commerce.demo.dto.request.RegisterRequest;
import E_Commerce.demo.dto.response.AuthResponse;

public interface AuthService {
    String registerUser(RegisterRequest registerRequest);
    AuthResponse loginUser(LoginRequest loginRequest);
}
