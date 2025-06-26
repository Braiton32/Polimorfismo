public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Polimorfismo dinámico: sobrescritura del método getArea
    @Override
    public double getArea() {
        double a = (base * altura) / 2;
        // Asegúrate de que FiguraGeometrica tenga setArea(double)
        super.setArea(a);
        return a;
    }

    // Si FiguraGeometrica tiene un método getPerimetro(), usa @Override
    @Override
    public double getPerimetro() {
        double p = 3 * base;
        return p;
    }

    // Polimorfismo dinámico: sobrescritura de toString
    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + "]";
}
}