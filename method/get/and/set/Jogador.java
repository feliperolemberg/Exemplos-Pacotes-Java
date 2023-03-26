package method.get.and.set;

public class Jogador {
    private String nome;
    private int idade;
    private float altura;
    
    // Set
    public void setnome(String argnome){
        this.nome = argnome;}
    
    public void setidade(int argidade){
        this.idade = argidade;}
    
    public void setaltura(float argaltura){
        this.altura = argaltura;}
    
    // Get
    public String getnome(){
        return this.nome;}
    
    public int getidade(){
        return this.idade;}
    
    public float getaltura(){
        return this.altura;}
}
