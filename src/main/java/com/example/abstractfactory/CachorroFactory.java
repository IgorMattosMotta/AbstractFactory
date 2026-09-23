package com.example.abstractfactory;

public class CachorroFactory implements AnimalFactory{
    @Override
    public Vacinacao createVacinacao() {
        return new VacinacaoCachorro();
    }

    @Override
    public Castracao createCastracao() {
        return new CastracaoCachorro();
    }
}
