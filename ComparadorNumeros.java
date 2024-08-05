public class ComparadorNumeros {
    public static String comparar(double a, double b) {
        if (a > b) {
            return "A es mayor que B";
        } else if (a < b) {
            return "A es menor que B";
        } else {
            return "A es igual a B";
        }
    }
}
