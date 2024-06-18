public class No {
    private String[] nomes;
    private int[] idades;
    private int posicao;
    
    public No(){
        nomes = new String[10];
        idades = new int[nomes.length];
        posicao = -1;
    }
    
    protected String[] getNomes(){
        return this.nomes;
    }
    
    protected int[] getIdades(){
        return this.idades;
    }
    
    protected int getPosicao(){
        return this.posicao;
    }
    
    public void setNomes(String[] nomes){
        this.nomes = nomes;
    }
    
    protected void setNomes(int[] idades){
        this.idades = idades;
    }
    
    protected void setPosicao(int posicao){
        this.posicao = posicao;
    }
}