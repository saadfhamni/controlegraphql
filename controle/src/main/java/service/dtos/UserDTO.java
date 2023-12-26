package service.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class UserDTO {
    private String name;
    private String email;
    private String date_Naissance;
}
