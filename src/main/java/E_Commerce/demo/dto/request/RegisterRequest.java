package E_Commerce.demo.dto.request;

import E_Commerce.demo.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password must atleast 6 character")
    private String password;
    private Role role;
}
