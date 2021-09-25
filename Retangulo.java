package ListaDois;

public class Retangulo {

    private int lado1;
    private int lado2;
    private int areaR;


    public void Quadrado(int lado1) {
        this.lado1 = lado1;
        int quadrado = lado1 * 4;
    }


    public void area(){
        int area = lado1 *lado2;
        System.out.println("Area: " + area);


    }

    public void perimetro(){
       int perimetro= (lado1 *2) + (lado2 * 2);
       System.out.println("Perimetro: "+ perimetro);


    }



    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getAreaR() {
        return areaR;
    }

    public void setAreaR(int areaR) {
        this.areaR = areaR;
    }
}
