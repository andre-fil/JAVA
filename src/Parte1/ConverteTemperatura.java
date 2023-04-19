package Parte1;

public class ConverteTemperatura {

    double temperaturaCelsius;
    double temperaturaFahrennheit;

    public double converteParaFh(double temperaturaCelsius){
        this.temperaturaFahrennheit = (temperaturaCelsius * 1.8) + 32;
        return this.temperaturaFahrennheit;
    }

    public int castingFh(){
        int tempFh = (int) this.temperaturaFahrennheit;
        return tempFh;
    }

    public static void main(String[] args){
        ConverteTemperatura c1 = new ConverteTemperatura();

        System.out.println(c1.converteParaFh(45));
        System.out.println(c1.castingFh());
    }



}
