import java.util.Stack;

public class Pilha {
    private Stack<String> pilha;

    public Pilha() {
        pilha = new Stack<String>();
    }

    public void empilhar(String nome) {
        pilha.push(nome);
    }

    public String desempilhar() {
        if (!pilha.isEmpty()) {
        return pilha.pop();
        } else {
        return "A pilha está vazia!";
        }
    }

    public String topo() {
        if (!pilha.isEmpty()) {
            return pilha.peek();
        } else {
            return "A pilha está vazia!";
        }
    }

    public String verificaPilha(){
        if(pilha.isEmpty()){
        return "vazia";
        }

        return "cheia";
    }

    public int tamanho() {
        return pilha.size();
    }

    @Override
    public String toString() {
        return pilha.toString();
    }
}