public class Main {
    private static Pilha pilha = new Pilha();
    
    public static void main(String[] args){
        verificaPilha();
    }
    
    private static void verificaPilha(){
        System.out.println("+ + + verificacao pilha + + +\n");
        System.out.println("a pilha esta vazia: " + pilha.estaVazia());
        System.out.println("a pilha esta cheia: " + pilha.estaCheia());
        System.out.println("elementos na pilha: " + pilha.tamanhoPilha());
        System.out.println("capacidade da pilha: " + pilha.capacidadePilha());
    }
}