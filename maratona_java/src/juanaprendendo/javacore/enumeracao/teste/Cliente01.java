package juanaprendendo.javacore.enumeracao.teste;

import juanaprendendo.javacore.enumeracao.dominio.Cliente;
import juanaprendendo.javacore.enumeracao.dominio.TipoCliente;

public class Cliente01 {
    static void main() {
        Cliente cliente = new Cliente("Juau", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Juan",TipoCliente.PESSOA_JURIDICA);
        IO.println(cliente);
        IO.println(cliente2);

    }
}
