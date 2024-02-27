public class Main {
  public static void main(String[] args) {

    contador c = new contador();

    c.incrementar();
    c.mostrar();
    c.zerar();
    c.incrementar();
    c.incrementar();
    c.incrementar();
    c.decrementar();
    c.mostrar();

    imcresult i = new imcresult();

    i.peso = 80;
    i.altura = 1.80;
    i.calcular();
    i.mostrar();
  }


}