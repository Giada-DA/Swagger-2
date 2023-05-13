package co.develhope.swagger2.entities;

import io.swagger.annotations.ApiModelProperty;

public class ArithmeticOperation {

    @ApiModelProperty(value = "Operazione aritmetica", example = "Addizione")
    private String nome;

    @ApiModelProperty(value = "Numeri minimi che servono per l'operazione", example = "2")
    private int numeriMinimiPerOperazione;

    @ApiModelProperty(value = "Ciò che fa l'operazione", example = "addendo + addendo = somma")
    private String descrizione;

    @ApiModelProperty(value = "Lista delle proprietà dell'operazione", example = "['Commutativa', 'associativa', 'dissociativa'}")
    private String[] proprieta;

    public ArithmeticOperation() {
    }

    public ArithmeticOperation(String nome, int numeriMinimiPerOperazione, String descrizione, String[] proprieta) {
        this.nome = nome;
        this.numeriMinimiPerOperazione = numeriMinimiPerOperazione;
        this.descrizione = descrizione;
        this.proprieta = proprieta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeriMinimiPerOperazione() {
        return numeriMinimiPerOperazione;
    }

    public void setNumeriMinimiPerOperazione(int numeriMinimiPerOperazione) {
        this.numeriMinimiPerOperazione = numeriMinimiPerOperazione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String[] getProprieta() {
        return proprieta;
    }

    public void setProprieta(String[] proprieta) {
        this.proprieta = proprieta;
    }
}