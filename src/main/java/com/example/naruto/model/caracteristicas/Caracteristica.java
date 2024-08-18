package com.example.naruto.model.caracteristicas;


import com.example.naruto.model.biju.Biju;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@SequenceGenerator(name = "seq_caracteristica" , sequenceName = "seq_caracteristica", allocationSize = 1)
public class Caracteristica extends Biju {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caracteristica")
    @Id
    private Long id;

    private String caracteristica;

}
