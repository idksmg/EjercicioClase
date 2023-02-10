public class Aplicacion {

  private static Tienda tienda;

  public static void main(String[] args) {
    configure(args);
    goShopping();
  }

  static void configure(String[] args) {

    if (null != args && args[0].equalsIgnoreCase("efectivo"))
      tienda = new PagoCredito();
    else {
      tienda = new PagoCredito();
    }
  }

  static void goShopping() {
    tienda.buySomething();
  }
}