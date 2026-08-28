package juanaprendendo.javacore.modificadorestatico.teste;

import juanaprendendo.javacore.modificadorestatico.dominio.Carro;

public class CarroTest01 {
    static void main() {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi" , 290);
        Carro.setVelocidadeLim(190);
        c1.imorime();
        c2.imorime();
        c3.imorime();
    }
}
