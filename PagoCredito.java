public class PagoCredito extends Tienda {


  @Override
  public Pago makePayment() {
      return new Efectivo();
  }
}