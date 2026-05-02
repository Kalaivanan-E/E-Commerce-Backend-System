package E_Commerce.demo.service;

import E_Commerce.demo.dto.request.RegisterRequest;

public interface AuthService {
    String registerUser(RegisterRequest registerRequest);
}
