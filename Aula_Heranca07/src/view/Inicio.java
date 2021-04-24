
package view;

import Model.Fisica;
import Model.Pessoa;

public class Inicio {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(0, null, null, null);
        p1.nome = "João";
        
        Fisica pf = new Fisica(1, "João", "Rua a", "123", "00");
        pf.cadastrar();
        
       // Pessoa p2 = new Pessoa();
    }    
}

