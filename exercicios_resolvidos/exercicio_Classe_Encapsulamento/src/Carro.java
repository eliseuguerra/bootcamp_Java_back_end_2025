public class Carro {
    private boolean connected;
    private int currentSpeed;
    private int currentMarch;

    public Carro(){
        this.connected = false;
        this.currentMarch = 0;
        this.currentMarch = 0;
        System.out.println("Carro desligado, em ponto morto e 0 Km/h");
    }
    public void toConect(){
        if(!connected){
            this.connected = true;
            System.out.println("Carro ligado.");
        }else{
            System.out.println("Carro ja esta ligado.");
        }
    public void toSwitchOff(){
            if(connected){
                if(currentSpeed == 0 && currentMarch == 0){
                    this.connected = false;
                    System.out.println("Carro desligado.");
                }else{
                    System.out.println("Carro esta desligado, precisa esta ligado.");
                }
            } else{
                System.out.println("Carro esta desligado.");
            }
        }
    public void start(){

        }
    }
}
