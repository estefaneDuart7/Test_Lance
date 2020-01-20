package br.edu.ifal.controle;

import br.edu.ifal.model.Lance;
import br.edu.ifal.model.Leilao;

/**
 * ControleLeilao
 */
public class ControleLeilao {

   public boolean validarLance(Lance novoLance, Leilao leilao){
    boolean validade = false;
    if(novoLance.getValor() >= leilao.getValorMinimo())
        validade = true;
    return validade;
   }

}