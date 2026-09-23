package com.example.abstractfactory;

public class VacinacaoGato implements Vacinacao{
    @Override
    public String vacinar() {
        return "Vacinas de gato";
    }
}