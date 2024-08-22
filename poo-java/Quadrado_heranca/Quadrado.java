public class Quadrado extends Retangulo{
    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado(){
      return this.getAltura();
    }

    public void setLado(double lado){
      this.setAltura(lado);
      this.setBase(lado);
    }

    public void setAltura(double altura){
      this.setAltura(lado);
      this.setBase(lado);
    }
}