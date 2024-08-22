public class Retangulo {
    private double altura;
    private double base;
  
    public Retangulo(double altura, double base) {
      this.altura = altura;
      this.base = base;
    }
  
    public double getAltura() {
      return this.altura;
    }
  
    public double getBase() {
      return this.base;
    }
  
    public double getArea() {
      return this.altura * this.base;
    }
  
    public double getPerimetro() {
      return 2 * (this.altura + this.base);
    }
  
    public void setBase(double base) {
      this.base = base;
    }
  
    public void setAltura(double altura) {
      this.altura = altura;
    }
  }