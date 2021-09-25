package ListaDois;



public class Circulo {
    private float raio;
    private float perimetro;
    private float area;



    public void area (){
        double area = (raio *2) * (3.14);
        System.out.println("Area:" + area);
    }

    public void perimetro(){
        double perimetro = 2*(3.14)*raio;
        System.out.println("Perimetro:" + perimetro);
    }




    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}

