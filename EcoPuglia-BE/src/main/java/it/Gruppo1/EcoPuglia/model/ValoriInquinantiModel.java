package it.Gruppo1.EcoPuglia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name  = "ValoriInquinanti")
public class ValoriInquinantiModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotEmpty(message = "Il campo tipoValore non può essere vuoto")
    private String tipoValore;
    @NotNull
    @NotEmpty(message = "Il campo valore non può essere vuoto")
    private String valore;
    @ManyToOne
    @JoinColumn(name = "CODAria", referencedColumnName = "IDAria")
    private AriaModel ariaInfo;

    public ValoriInquinantiModel(String tipoValore, String valore, AriaModel ariaInfo) {
        this.tipoValore = tipoValore;
        this.valore = valore;
        this.ariaInfo = ariaInfo;
    }
}