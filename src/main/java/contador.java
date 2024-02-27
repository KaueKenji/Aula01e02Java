public class contador {

  int cont;

  void decrementar() {
    if (cont > 0)
      cont--;
  }

  void incrementar() {
    cont++;
  }

  void zerar() {
    cont = 0;

  }

  void mostrar() {
    System.out.println("contador: " + cont);
  }

}