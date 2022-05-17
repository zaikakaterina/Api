package app.dto.usersDto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
}
