package E_Commerce.demo.service.impl;

import E_Commerce.demo.dto.request.RegisterRequest;
import E_Commerce.demo.entity.User;
import E_Commerce.demo.repository.UserRepository;
import E_Commerce.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;

    public String registerUser(RegisterRequest registerRequest){
        userRepository.findByEmail(registerRequest.getEmail())
                .ifPresent(user -> {
                    throw new RuntimeException("Email Alread Exist");
                });

        User user = new User();
        user.setName(registerRequest.getName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setRole(registerRequest.getRole());

        return "User register Successfully";
    }
}
