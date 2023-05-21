public class Main {
    public static void main(String[] args) {
        int numeroIf = -45;
        int numeroWhile = -8;
        int numeroFor = 0;
        String estacion = "PRIMAVERA";

        if (numeroIf >= 0) {
            System.out.println(numeroIf + " es un numero positivo");
        } else {
            System.out.println(numeroIf + " es un numero negativo");
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("Do while una sola vez");
        } while (numeroWhile > 3);

        for (int i = numeroFor; i < 3; i++) {
            System.out.println("La pos de indice es: " + i);
        }

        switch (estacion) {
            case "VERANO", "PRIMAVERA", "OTOÑO" -> System.out.println("La flores florecen");
            case "INVIERNO" -> System.out.println("Las flores no florecen");
            default -> System.out.println("No existe estacion, no hay flores :(");
        }
    }
}
