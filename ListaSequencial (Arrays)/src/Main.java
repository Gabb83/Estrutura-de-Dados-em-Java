import java.util.Scanner;

class Main {
        
    //instancia os objetos scanner e vetor
    private static Scanner input = new Scanner(System.in);
    public static Vetor vetor = new Vetor(10);
    
    public static void main(String[] args){
        
        //add itens inicialmente pelo metodo construtor
        vetor.adiciona("Joao");
        vetor.adiciona("Luis");
        
        boolean verificaLoop = true;
        while(verificaLoop){
            
            verificaLista();
            
            menuPrincipal();
            
            System.out.println("\nDeseja voltar ao inicio?");
            System.out.println("1 - sim   |   2 - nao");
            int respostaLoop = Integer.parseInt(input.next());
            
            //caso a resposta seja != 1 encerra o loop
            if(respostaLoop != 1){
                verificaLoop = false;
            }
        }
        
        //chama o metodo finalizaSistema
        finalizaSistema();
    }
    
    private static void menuPrincipal(){
        System.out.println("+--------------------------+");
        System.out.println("|       MENU PRINCIPAL     |");
        System.out.println("+--------------------------+");
        System.out.println("|    1 - ADICIONAR         |");
        System.out.println("|    2 - REMOVER           |");
        System.out.println("|    3 - EXIBIR            |");
        System.out.println("|    4 - ESVAZIAR          |");
        System.out.println("|    5 - BUSCAR            |");
        System.out.println("|    6 - SAIR              |");
        System.out.println("+--------------------------+");
        
        int indiceMenu = Integer.parseInt(input.next());
        System.out.println();
        
        switch(indiceMenu){
            case 1:{
                //adicionar elementos
                menuAdicionar();
                
                break;
            }
            case 2:{
                //remover elementos
                menuRemover();
                menuExibir();
                
                break;
            }
            case 3:{
                //exibe a capacidade da lista e o conteudo dela
                vetor.getCapacidadeLista();
                menuExibir();
                
                break;
            }
            case 4:{
                //responsavel por esvaziar a lista
                menuEsvaziar();
                
                break;
            }
            case 5:{
                //responsavel por buscar elementos
                menuBuscar();
                break;
            }
            case 6:{
                //faz com que o programa encerre sem passar pelo loop
                finalizaSistema();
                
                break;
            }
            default:{
                //caso nenhum dos casos sejam validos
                System.out.println("Numero Invalido");
                System.out.println("Tente Novamente");
                
                break;
            }
        }
    }
    
    //responsavel por add um item pela sua posicao
    private static void menuAdicionar(){
        System.out.print("Digite o nome em que deseja guardar: ");
        String nome = input.next();
        System.out.print("Digite a posicao em que deseja adicionar: ");
        int posicao = Integer.parseInt(input.next());
        
        //chama o metodo remove passando como parametro a posicao/nome que deseja add
        vetor.adiciona(posicao, nome);
    }
    
    //responsavel por remover um item pela sua posicao
    private static void menuRemover(){
        System.out.print("Digite a posicao do vetor que deseja remover: ");
        int pos = Integer.parseInt(input.next());
        
        //chama o metodo remove passando como parametro a posicao que deseja remover
        vetor.remove(pos);
    }
    
    //exibe o conteudo da lista
    private static void menuExibir(){
        vetor.getTamanho();
        System.out.println("\nExibicao da lista: ");
        System.out.println(vetor.toString());
    }
    
    //busca elementos
    private static void menuBuscar(){
        System.out.print("Digite a posicao que deseja buscar: ");
        int posicao = Integer.parseInt(input.next());
        
        //printa o elemento exibido
        System.out.println(vetor.busca(posicao));
    }
    
    //esvazia completamente a lista
    private static void menuEsvaziar(){
        vetor.esvaziarLista();
    }
    
    //metodo responsavel por verificar se a lista esta cheia/vazia
    private static void verificaLista(){
        System.out.println();
        System.out.println(vetor.listaVazia());
        System.out.println(vetor.listaCheia() + "\n");
    }
    
    //metodo responsavel por fechar o scanner e encerrar o sistema
    private static void finalizaSistema(){
        System.out.println("\nSistema finalizado");
        
        input.close();
        System.exit(0);
    }
}