package br.edu.ifal.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifal.model.Cliente;
import br.edu.ifal.model.Lance;
import br.edu.ifal.model.Leilao;
import br.edu.ifal.model.Produto;

public class ControleLeilaoTest {

    @Test
    public void deveRetornaVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(2501, cliente);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = true;
        assertEquals(validadeEsperada, validadeRetornada);
    }

    @Test
    public void deveRetornaFalsoParaUmLanceMenorQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(2000, cliente);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = false;
        assertEquals(validadeEsperada, validadeRetornada);
    }
    @Test
    public void deveRetornaVerdadeiroParaUmLanceIgualQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(2500, cliente);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = true;
        assertEquals(validadeEsperada, validadeRetornada);
    }
}