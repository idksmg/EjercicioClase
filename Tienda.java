public abstract class Tienda {

  public void buySomething() {

    Pago payment = makePayment();
    makePayment().paymentMethod();
  }

  public abstract Pago makePayment();

} 
    
