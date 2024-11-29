package hexlet.code.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import static jakarta.persistence.GenerationType.IDENTITY;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;


@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(of = "email")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @NotBlank
    @ToString.Include
    private String firstName;

    @NotBlank
    @ToString.Include
    private String lastName;

    @Email
    @Column(unique = true)
    @ToString.Include
    private String email;

    @NotBlank
    @JsonIgnore
    private String password;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
