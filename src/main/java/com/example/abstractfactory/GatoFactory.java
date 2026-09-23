package com.example.abstractfactory;

public class GatoFactory implements AnimalFactory{
    @Override
    public Vacinacao createVacinacao() {
        return new VacinacaoGato();
    }

    @Override
    public Castracao createCastracao() {
        return new CastracaoGato();
    }
}
