package E_Commerce.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginRequest {
    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email is Required")
    private String email;
    @NotBlank(message = "Password is Required")
    @Size(min = 6, message = "password is required")
    private String password;
}
