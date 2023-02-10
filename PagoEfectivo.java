public class PagoEfectivo extends Tienda {

  @Override
  public Pago makePayment() {
    return new Efectivo();
  }
}
