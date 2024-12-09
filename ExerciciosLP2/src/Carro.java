public class Carro {

    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;

    }

    public boolean Liga(){
        System.out.println("Carro Ligado");
        return true;
    }

    public boolean Desliga(){

        System.out.println("Carro Desligado");
        return false;

    }

    public void Acelera(){
        System.out.println("Acelerando");
        velocidade++;
        System.out.println("Velocidade: " + velocidade);
    
    }

    public void Desacelera(){
        System.out.println("Desacelerando");
        velocidade--;
        System.out.println("Velocidade: " + velocidade);
    
    }

    public void VirarDireita(){
        System.out.println("Virando a direita");
    
    }

    public void VirarEsquerda(){
        System.out.println("Virando a esquerda");
    
    }

    public void MarchaFrente(){
        System.out.println("Marcha pra frente");
        marcha++;
        System.out.println("Marcha: " + marcha);
    
    }

    public void MarchaTras(){
        System.out.println("Marcha para trás");
        marcha--;
        System.out.println("Marcha: " + marcha);
    
    }

    public static void main(String[] args){
        Carro c =  new Carro("gol", 0, 0,0);
        c.Liga();
        c.MarchaFrente();
        c.Acelera();
        c.Acelera();
        c.Acelera();
        c.MarchaFrente();
        c.Desacelera();
        c.MarchaTras();
        c.VirarDireita();
        c.VirarEsquerda();
        c.MarchaTras();
        c.Desliga();
       
    }

}
