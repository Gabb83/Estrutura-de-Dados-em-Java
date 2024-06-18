class Pilha {
    static No no = new No();
    
    protected boolean estaCheia(){
        return no.getPosicao() == no.getNomes().length-1;
    }
    
    protected boolean estaVazia(){
        return no.getPosicao() == -1;
    }
    
    protected int capacidadePilha(){
        return no.getNomes().length;
    }
    
    protected int tamanhoPilha(){
        return no.getPosicao()+1;
    }
}