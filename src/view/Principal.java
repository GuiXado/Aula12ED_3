package view;

import br.gui.listagenerica.Lista;
import controller.ControllerHash;

public class Principal {

	public static void main(String[] args) {
		
        try {
            ControllerHash c = new ControllerHash();
            Lista[] tabelaAntiga = c.carregaTabelaAntiga();
            c.rearranjo(tabelaAntiga);
            c.exibirNovaTabela();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
		
	}

}
