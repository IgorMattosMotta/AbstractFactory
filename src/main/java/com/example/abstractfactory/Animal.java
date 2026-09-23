package com.example.abstractfactory;

public class Animal {
    private Castracao castracao;
    private Vacinacao vacina;

    public Animal (AnimalFactory fabrica){
        this.castracao = fabrica.createCastracao();
        this.vacina = fabrica.createVacinacao();
    }

    public String realizarVacinacao(){
        return this.vacina.vacinar();
    }

    public String realizarCastracao(){
        return this.castracao.castrar();
    }
}
