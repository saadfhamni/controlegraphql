package dao.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString @Table(name='users')



public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_User;
    private String nom;
    private String email;
    private String date_naissance;
    private String password;



}
