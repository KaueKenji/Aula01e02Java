public class imcresult {

  double peso;
  double altura;
  double imcfinal;

  void calcular() {

    imcfinal = peso / (altura * altura);

  }

  void mostrar() {

    if (imcfinal < 18.5) {
      System.out.printf("IMC = %.2f", imcfinal, " - Abaixo do peso");
    } else if (imcfinal < 25) {
      System.out.printf("IMC = %.2f", imcfinal, " - Peso normal");
    } else if (imcfinal < 30) {
      System.out.printf("IMC = %.2f", imcfinal, " - Acima do peso");
    } else {
      System.out.printf("IMC = %.2f", imcfinal, " - Obesidade");
    }
    // fim mostrar
  }
  // fimclass
}