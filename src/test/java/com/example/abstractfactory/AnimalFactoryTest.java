package com.example.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

class AnimalFactoryTest {

    @Test
    void cachorroFactoryCriaFamiliaDeCachorro() {
        AnimalFactory fabrica = new CachorroFactory();

        assertInstanceOf(VacinacaoCachorro.class, fabrica.createVacinacao());
        assertInstanceOf(CastracaoCachorro.class, fabrica.createCastracao());
    }

    @Test
    void gatoFactoryCriaFamiliaDeGato() {
        AnimalFactory fabrica = new GatoFactory();

        assertInstanceOf(VacinacaoGato.class, fabrica.createVacinacao());
        assertInstanceOf(CastracaoGato.class, fabrica.createCastracao());
    }

    @Test
    void animalUsaOsProdutosDaFabricaDeCachorro() {
        Animal animal = new Animal(new CachorroFactory());

        assertEquals("Vacinas de cachorro", animal.realizarVacinacao());
        assertEquals("Castra de cachorro", animal.realizarCastracao());
    }

    @Test
    void animalUsaOsProdutosDaFabricaDeGato() {
        Animal animal = new Animal(new GatoFactory());

        assertEquals("Vacinas de gato", animal.realizarVacinacao());
        assertEquals("Castra de gato", animal.realizarCastracao());
    }
}
