import java.util.Scanner;

public class Main {
    private static Pilha pilha = new Pilha();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        pilha.empilhar("Luis");
        pilha.empilhar("Alice");
        pilha.empilhar("Joao");

        System.out.println("Verificacao de lista: " + pilha.tamanho());

        menuPilha();

        finalizarSistema();
    }

    private static void menuPilha(){

        System.out.println("+--------------------------+");
        System.out.println("|       MENU PRINCIPAL     |");
        System.out.println("+--------------------------+");
        System.out.println("|    1 - ADICIONAR         |");
        System.out.println("|    2 - REMOVER           |");
        System.out.println("|    3 - EXIBIR            |");
        System.out.println("|    4 - BUSCAR            |");
        System.out.println("|    5 - SAIR              |");
        System.out.println("+--------------------------+");

        int escolhaMenu = Integer.parseInt(input.next());

        switch(escolhaMenu){
        case 1:{
            adicionarPilha();
            
            break;
        }
        case 2:{
            break;
        }
        case 3:{
            break;
        }
        case 4:{
            exibirPilha();
            
            break;
        }
        case 5:{
            finalizarSistema();
            
            break;
        }
        default:{
            
            break;
        }
        }

    }

    private static void adicionarPilha(){
        System.out.println("Digite o nome que deseja adicionar: ");
        String nome = input.nextLine();

        pilha.empilhar(nome);
        
        System.out.println("Nome adicionado");
    }

    private static void exibirPilha(){
        System.out.println("+ + + Elementos da Pilha + + +");
        System.out.println("Elemento no topo: " +pilha.topo());
        System.out.println(pilha);
        System.out.println("Quantidade de elementos na pilha: " + pilha.tamanho());
        System.out.println("Verificacao de lista: " + pilha.verificaPilha());
    }

    private static void finalizarSistema(){
        System.out.println("Sistema finalizado!");
        
        input.close();
        System.exit(0);
    }
}