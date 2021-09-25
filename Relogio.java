package ListaDois;

public class Relogio {
    private int horas;
    private int minutos;
    int i = 0;
    int j=0;


    public void proximoMinuto() {
        for (i=0; minutos < 60; minutos++) {
            System.out.println(horas + ":" + minutos);
        }

    }

    public void proximaHora(){
        while(horas <=23){
            for (j=0; horas < 24;){
                for (i=0; minutos < 60; minutos++) {
                    System.out.println(horas + ":" + minutos);
                }
            }horas++;
            int minutos =00;
            System.out.println(horas + ":" + minutos);
        }

    }




    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
