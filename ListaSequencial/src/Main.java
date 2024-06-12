public class Main {
    public static void main(String[] args){
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
    
        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());
    }
}
