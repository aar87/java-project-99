package hexlet.code.dto.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserAuthDTO {

    @Email
    private String username;

    @Size(min = 3, max = 100)
    private String password;
}
