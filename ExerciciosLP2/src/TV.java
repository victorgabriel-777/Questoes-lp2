public class TV {
    private int tamanho;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public TV(int tamanho, String marca, int voltagem, int canal){
        this.tamanho = tamanho;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
    }

    public void Ligar(){
        int consumo;
        System.out.println("Ligando TV");
        consumo = tamanho * voltagem;
        System.out.println("Consumo: " + consumo + " Watts");
    }

    public void Desligar(){
        System.out.println("Desligando TV");
    }

    public void AumentaVolume(){
        if(volume < 10){
            volume++;
        }
        System.out.println("Volume: " + volume);
    }

    public void DiminuiVolume(){
        if(volume > 0){
            volume--;
        }
        System.out.println("Volume: " + volume);
    }

    public void SobeCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void DesceCanal(){
        canal--;
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args){
        TV tv = new TV(34, "LG", 110, 5);
        tv.Ligar(); // Ligando a TV
        tv.AumentaVolume(); // Aumentando o volume
        tv.DiminuiVolume(); // Diminuindo o volume
        tv.SobeCanal(); // Subindo o canal
        tv.DesceCanal(); // Descendo o canal
        tv.Desligar(); // Desligando a TV
    }


}
