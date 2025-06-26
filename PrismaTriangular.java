public class PrismaTriangular extends Triangulo {

    private double volumen;
    private double alturaPrisma;

    //  Sobrecarga de constructor (1): Recibe solo el volumen
    public PrismaTriangular(String nombre, double base, double alturaTriangulo, double volumen) {
        super(nombre, base, alturaTriangulo);
        this.volumen = volumen;
        this.alturaPrisma = 0.0; // Altura no conocida aún
    }

    //  Sobrecarga de constructor (2): Recibe volumen y altura del prisma
    public PrismaTriangular(String nombre, double base, double alturaTriangulo, double volumen, double alturaPrisma) {
        super(nombre, base, alturaTriangulo);
        this.volumen = volumen;
        this.alturaPrisma = alturaPrisma;
    }

    // Getter y setter para volumen
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Getter y setter para altura del prisma
    public double getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    //  Método que calcula el volumen usando el área de la base (heredado de Triangulo)
    public double calcularVolumen() {
        // Área del triángulo base * altura del prisma
        double volumenCalculado = getArea() * alturaPrisma;
        this.volumen = volumenCalculado;
        return volumenCalculado;
    }

    //  Sobreescritura de método toString()
    @Override
    public String toString() {
        return super.toString() +
            " PrismaTriangular [volumen=" + volumen + ", altura del prisma=" + alturaPrisma + "]";
}
}
