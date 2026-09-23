package com.example.abstractfactory;

public class VacinacaoCachorro implements Vacinacao{
    @Override
    public String vacinar() {
        return "Vacinas de cachorro";
    }
}
