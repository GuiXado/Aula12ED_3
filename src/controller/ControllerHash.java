package controller;

import br.gui.listagenerica.Lista;

public class ControllerHash {
		// vetor de lista
		Lista[] vetor;

		public ControllerHash() {
			vetor = new Lista[5];
			inicializarTabelaHash();
		}

		// inicializando cada índice do vetor com uma lista
		private void inicializarTabelaHash() {
			int tamanho = vetor.length;
			for (int i = 0; i < tamanho; i++) {
				vetor[i] = new Lista();
			}
		}
		
		
	    // Função hash
	    private int hash(int valor) {
	    	double A = (Math.sqrt(13) - 3) / 2.0;
	    	return (int) (5 * ((valor * A) % 1));
	    }
	    
	    public void rearranjo(Lista[] tabela) throws Exception{
	    	// percorrer todo o vetor (tabela)
	    	for (int posAnterior = 0; posAnterior < tabela.length; posAnterior++) {
	            int tamanho = tabela[posAnterior].size();
	            // percorre cada índice da lista por índice do vetor
	            for (int i = 0; i < tamanho; i++) {
	                int valor = (int) tabela[posAnterior].get(i); // pego o valor desse índice
	                int novaPos = hash(posAnterior); // usando o índice do vetor acho a nova posição
	                vetor[novaPos].addLast(valor);
	            }
	        }
	    }
	
	    public void exibirNovaTabela() throws Exception {
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Posição " + i + ": ");
	            int tamanho = vetor[i].size();
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print(vetor[i].get(j) + " -> ");
	            }
	            System.out.println("null");
	        }
	    }

	    
	    
	    public Lista[] carregaTabelaAntiga() throws Exception{
	    	// Simulação da tabela antiga (10 posições)
	        Lista[] tabela = new Lista[10];
	        for (int i = 0; i < tabela.length; i++) {
	            tabela[i] = new Lista();
	        }

	        // Posição 0
	        tabela[0].addLast(12);
	        tabela[0].addLast(647);
	        tabela[0].addLast(158);
	        tabela[0].addLast(136);
	        tabela[0].addLast(467);

	        // Posição 1
	        tabela[1].addLast(156);
	        tabela[1].addLast(600);
	        tabela[1].addLast(511);

	        // Posição 2
	        tabela[2].addLast(263);
	        tabela[2].addLast(414);
	        tabela[2].addLast(882);
	        tabela[2].addLast(945);
	        tabela[2].addLast(914);
	        tabela[2].addLast(953);

	        // Posição 3
	        tabela[3].addLast(341);
	        tabela[3].addLast(723);
	        tabela[3].addLast(194);
	        tabela[3].addLast(513);

	        // Posição 4
	        tabela[4].addLast(591);
	        tabela[4].addLast(847);
	        tabela[4].addLast(66);
	        tabela[4].addLast(337);
	        tabela[4].addLast(979);
	        

	        // Posição 5
	        tabela[5].addLast(768);
	        tabela[5].addLast(53);

	        // Posição 6
	        tabela[6].addLast(114);
	        tabela[6].addLast(803);
	        tabela[6].addLast(90);
	        tabela[6].addLast(339);
	        tabela[6].addLast(550);

	        // Posição 7
	        tabela[7].addLast(574);
	        tabela[7].addLast(977);
	        tabela[7].addLast(216);
	        tabela[7].addLast(99);
	        tabela[7].addLast(617);
	        tabela[7].addLast(88);

	        // Posição 8
	        tabela[8].addLast(142);
	        tabela[8].addLast(148);
	        tabela[8].addLast(227);
	        tabela[8].addLast(939);
	        tabela[8].addLast(585);
	        tabela[8].addLast(338);
	        tabela[8].addLast(206);

	        // Posição 9
	        tabela[9].addLast(569);
	        tabela[9].addLast(708);
	        tabela[9].addLast(844);
	        
	        return tabela;

	    }
}
