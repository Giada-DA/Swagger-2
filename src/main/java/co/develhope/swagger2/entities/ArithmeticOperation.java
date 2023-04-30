package co.develhope.swagger2.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    @ApiModelProperty(value = "Operazione aritmetica", example = "Addizione")
    private String nome;

    @ApiModelProperty(value = "Numeri minimi che servono per l'operazione", example = "2")
    private int numeriMinimiPerOperazione;

    @ApiModelProperty(value = "Ciò che fa l'operazione", example = "addendo + addendo = somma")
    private String descrizione;

    @ApiModelProperty(value = "Lista delle proprietà dell'operazione", example = "['Commutativa', 'associativa', 'dissociativa'}")
    private String[] proprieta;

}