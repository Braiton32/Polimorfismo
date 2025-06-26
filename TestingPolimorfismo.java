public class TestingPolimorfismo {

    public static void main(String[] args) {
        // Figura base con nombre, área y perímetro
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexágono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.out.println("Datos de unaFigura: " + unaFigura);

        // Constructor sobrecargado: nombre + área
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentágono", 25.12);
        System.out.println("Datos de otraFigura: " + otraFigura);

        // Objeto Triángulo
        Triangulo triangulo1 = new Triangulo("Triángulo 1", 10.2, 15.8);
        System.out.println("Datos del Triángulo 1: " + triangulo1);
        System.out.println("Área del Triángulo 1: " + triangulo1.getArea());
        System.out.println("Perímetro del Triángulo 1: " + triangulo1.getPerimetro());


        // PRISMA TRIANGULAR


        // Constructor con volumen solo
        PrismaTriangular prisma1 = new PrismaTriangular("Prisma A", 8.0, 6.0, 96.0);
        System.out.println("Prisma creado con volumen fijo:");
        System.out.println(prisma1.toString());

        // Constructor con volumen y altura del prisma
        PrismaTriangular prisma2 = new PrismaTriangular("Prisma B", 5.0, 4.0, 0.0, 10.0);
        double volumenCalculado = prisma2.calcularVolumen();
        System.out.println("Prisma creado con volumen calculado:");
        System.out.println("Volumen calculado: " + volumenCalculado);
        System.out.println(prisma2.toString());

}
}