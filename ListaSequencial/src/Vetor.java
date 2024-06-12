import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else{
            return false;
        }
    }

    public boolean adiciona(int posicao, String elemento){
		if (!(posicao >= 0 && posicao < tamanho))
			throw new IllegalArgumentException("Posicao invalida");
		
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("posicao invalida");
        }

        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
            return -1;
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");


        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}