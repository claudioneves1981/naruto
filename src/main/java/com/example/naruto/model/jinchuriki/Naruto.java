package com.example.naruto.model.jinchuriki;


import com.example.naruto.model.biju.Kurama;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "seq_naruto" , sequenceName = "seq_naruto", allocationSize = 1)
public class Naruto extends Jinchuriki{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_naruto")
    private Long id;

    private String nome;
    private int quantidade_chakra;
    private int vontade;
    private Kurama kurama;

}
