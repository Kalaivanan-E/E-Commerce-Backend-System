package E_Commerce.demo.service.impl;

import E_Commerce.demo.config.JwtUtil;
import E_Commerce.demo.dto.request.LoginRequest;
import E_Commerce.demo.dto.request.RegisterRequest;
import E_Commerce.demo.dto.response.AuthResponse;
import E_Commerce.demo.entity.Role;
import E_Commerce.demo.entity.User;
import E_Commerce.demo.repository.UserRepository;
import E_Commerce.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String registerUser(RegisterRequest registerRequest){
        userRepository.findByEmail(registerRequest.getEmail())
                .ifPresent(user -> {
                    throw new RuntimeException("Email Alread Exist");
                });

        String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());

        User user = new User();
        user.setName(registerRequest.getName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodedPassword);
        user.setRole(registerRequest.getRole());

        userRepository.save(user);

        return "User register Successfully";
    }
    public AuthResponse loginUser(LoginRequest loginRequest){
        User user=userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(()-> new RuntimeException("User not Found"));

        if(!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())){
            throw  new RuntimeException("Invalid credentials");
        }

        String accessToken = jwtUtil.generateAccessToken(user.getEmail(), user.getRole().name());
        String refreshToken = jwtUtil.generateRefreshToken(user.getEmail());
        Role role = user.getRole();
        return new AuthResponse(accessToken,refreshToken,role);

    }
}
