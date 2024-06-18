class Vetor {
    private String[] elementos; //guarda elementos na lista
    private int tamanho; //guarda tamanho da lista
    
    //metodo construtor responsavel por inicializar as variaveis de classe
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    //retorna um valor booleano se listaVazia
    public boolean listaVazia(){
        System.out.print("a lista esta vazia: ");
        if(this.tamanho == 0){
            return true;
        }
        return false;
    }
    
    //retorna um valor booleano se listaCheia
    public boolean listaCheia(){
        System.out.print("a lista esta cheia: ");
        if(this.tamanho == this.elementos.length){
            return true;
        }
        return false;
    }

    //metodo que permite add sem a necessidade de posicao
    public boolean adiciona(String elemento){
        //verifica se o tamanho do array e menor que o tamanho da lista
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else{
            return false;
        }
    }

    //add novos elementos
    public boolean adiciona(int posicao, String elemento){
        //verifica se a posicao e valida ou nao
		if (!(posicao >= 0 && posicao < tamanho))
			throw new IllegalArgumentException("Posicao invalida");
        
		//percorre o array
		for(int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
        
        //add o elemento na posicao desejada
		this.elementos[posicao] = elemento;
        //incrementa +1 no tamanho da lista
		this.tamanho++;
		
		return true;
	}
    
    //remove elementos na lista pela posicao
	public void remove(int posicao){
        //verifica se a posicao e valida ou nao
        if (!(posicao >= 0 && posicao < tamanho))
			throw new IllegalArgumentException("Posicao invalida");
		
		for(int i = posicao; i < this.tamanho-1; i++){
		    this.elementos[i] = this.elementos[i+1];
		}
        //decrementa -1 no tamanho da lista
		this.tamanho--;
	}

    //metodo de busca
    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }
        return this.elementos[posicao];
    }

    //metodo de busca
    public int busca(String elemento){
        //percorre o array de elementos verificando se o elemento esta no array
        for(int i = 0; i < this.tamanho; i++){
            //quando achado retorna o valor de sua posicao
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public void esvaziarLista(){
        for(int i = 0; i < tamanho; i++){
            this.elementos[i] = null;
        }
        
        this.tamanho = 0;
        
        //se tudo ocorrer bem diz que a lista foi esvaziada
        if(this.tamanho == 0){
            System.out.println("Lista esvaziada");
        }
    }

    //retorna quanto elementos estao inseridos na lista
    public void getTamanho(){
        System.out.print("elementos na lista: " + tamanho);
    }
    
    //retorna a capacidade total de lista
    public void getCapacidadeLista(){
        System.out.print("capacidade da lista: " +  elementos.length + "\n");
    }

    //responsavel pela exibicao da lista e sobreescreve o metodo toString
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        
        for(int i = 0; i < this.tamanho-1; i++){
            s.append(i + " | ");
            s.append(this.elementos[i]);
            s.append("\n");
        }
        if(this.tamanho > 0){
            int i = --tamanho;
            s.append(i + " | ");
            tamanho++;
            s.append(this.elementos[this.tamanho-1]);
        }

        return s.toString();
    }
}