package ex4_java_com_objetos;

public class Tripe {

    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public Tripe() {
    }
    public Tripe(int alturaMinima, int alturaMaxima, int alturaAtual) {
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }
    public int getAlturaMinima() {
        return alturaMinima;
    }
    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }
    public int getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public int getAlturaAtual() {
        return alturaAtual;
    }
    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }
    public void Altura (int novaAltura){
        alturaAtual = novaAltura;
    }
    public void Dobrar(){
        alturaAtual = alturaAtual/2;
    }
    public void Desdobrar(){
        if (alturaAtual < alturaMaxima){
        alturaAtual = alturaAtual*2;}
        else{
            System.out.println("já está desdobrada");
        }
    }
    public void Guardar () {
        if (alturaAtual == alturaMaxima) {
            alturaAtual = alturaAtual / 2;
        }
    }
        public void prontoParaGuardar (){
            if (alturaAtual == alturaMinima){
                System.out.println("Guardado!");
            }
            else{
                alturaAtual = alturaAtual / 2;
            }
        }
    public void Usar () {
        if (alturaAtual == alturaMinima) {
            alturaAtual = alturaAtual * 2;
        }
    }
        public void prontoParaUsar (){
            if (alturaAtual == alturaMaxima){
                System.out.println("Pronto para usar!");
            }
            else{
                alturaAtual = alturaAtual * 2;
            }
        }
    }

