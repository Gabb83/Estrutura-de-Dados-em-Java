import java.util.Scanner;

public class Main {
    private static Pilha pilha = new Pilha();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        pilha.empilhar("Luis");
        pilha.empilhar("Alice");
        pilha.empilhar("Joao");

        System.out.println("Verificacao de lista: " + pilha.tamanho() + "\n");

        boolean verificaLoop = true;

        while(verificaLoop){
            menuPilha();

            System.out.println("\nDeseja voltar ao início: ");
            System.out.println("1 - sim // 2 - não");
            int opcao = Integer.parseInt(input.next());

            if(opcao != 1){
                verificaLoop = false;
            }
        }
        
        finalizarSistema();
    }

    private static void menuPilha(){

        System.out.println("+--------------------------+");
        System.out.println("|       MENU PRINCIPAL     |");
        System.out.println("+--------------------------+");
        System.out.println("|    1 - EMPILHAR          |");
        System.out.println("|    2 - DESEMPILHAR       |");
        System.out.println("|    3 - EXIBIR            |");
        System.out.println("|    4 - BUSCAR            |");
        System.out.println("|    5 - SAIR              |");
        System.out.println("+--------------------------+");

        int escolhaMenu = Integer.parseInt(input.next());

        System.out.println();

        switch(escolhaMenu){
            case 1:{
                adicionarPilha();
                
                break;
            }

            case 2:{
                desempilharPilha();

                break;
            }

            case 3:{
                exibirPilha();

                break;
            }

            case 4:{
                buscarPilha();
                
                break;
            }

            case 5:{
                finalizarSistema();
                
                break;
            }

            default:{
                System.out.println("Opçãp Inválida");
                System.out.println("Tente novamente");

                break;
            }
        }
    }

    private static void adicionarPilha(){
        System.out.println("Digite o nome que deseja adicionar: ");
        String nome = input.next();

        pilha.empilhar(nome);
        
        System.out.println("Nome adicionado");
    }

    private static void desempilharPilha(){
        pilha.desempilhar();

        System.out.println("Último elemento desempilhado");

    }

    private static void exibirPilha(){
        System.out.println("Quantidade de elementos na pilha: " + pilha.tamanho());
        System.out.println("Verificacao de lista: " + pilha.verificaPilha() + "\n");
        
        System.out.println("+ + + Elementos da Pilha + + +");
        System.out.println("Elemento no topo: " + pilha.topo());

        System.out.print("Elementos na pilha: ");
        System.out.println(pilha);
    }

    private static void buscarPilha(){
        System.out.println("Digite o elemento que deseja buscar: ");
        String nomeBuscado = input.next();

        pilha.buscar(nomeBuscado);
    }

    private static void finalizarSistema(){
        System.out.println("\nSistema finalizado!");
        
        input.close();
        System.exit(0);
    }
}