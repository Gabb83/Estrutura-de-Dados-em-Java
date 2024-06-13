import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static Vetor vetor = new Vetor(5);
    
    public static void main(String[] args){
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        
        boolean verificaLoop = true;
        while(verificaLoop){
            
            verificaLista();
            
            menuPrincipal();
            
            System.out.println("\nDeseja voltar ao inicio?");
            System.out.println("1 - sim   |   2 - nao");
            int respostaLoop = Integer.parseInt(input.next());
            
            if(respostaLoop != 1){
                verificaLoop = false;
            }
        }
        
        finalizaSistema();
    }
    
    private static void menuPrincipal(){
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("|       MENU PRINCIPAL     |");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("|    1 - ADICIONAR         |");
        System.out.println("|    2 - REMOVER           |");
        System.out.println("|    3 - EXIBIR            |");
        System.out.println("|    4 - ESVAZIAR          |");
        System.out.println("|    5 - SAIR              |");
        System.out.println("++++++++++++++++++++++++++++");
        
        int indiceMenu = Integer.parseInt(input.nextLine());
        
        switch(indiceMenu){
            case 1:{
                menuAdiciona();
                
                break;
            }
            case 2:{
                
                break;
            }
            case 3:{
                System.out.println("\n" + vetor.getTamanho());
                System.out.println("Exibicao da lista: ");
                System.out.println(vetor.toString());
                
                break;
            }
            case 4:{
                
                break;
            }
            case 5:{
                finalizaSistema();
                
                break;
            }
            default:{
                System.out.println("Numero Invalido");
                System.out.println("Tente Novamente");
                
                break;
            }
        }
    }
    
    private static void menuAdiciona(){
        System.out.print("Digite o nome em que deseja guardar: ");
        String nome = input.next();
        System.out.print("Digite a posicao em que deseja adicionar: ");
        int posicao = Integer.parseInt(input.next());
        
        vetor.adiciona(posicao, nome);
    }
    
    private static void verificaLista(){
        System.out.println(vetor.listaVazia());
        System.out.println(vetor.listaCheia() + "\n");
    }
    
    private static void finalizaSistema(){
        System.out.println("\nSistema finalizado");
        
        input.close();
        System.exit(0);
    }
}