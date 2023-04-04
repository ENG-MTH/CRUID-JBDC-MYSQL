package org.dutam.training.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "training_user_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;

}
