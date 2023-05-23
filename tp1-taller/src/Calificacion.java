public class Calificacion {
    public static void main(String[] args) {
        enum Notas { PERDIODERECHO, APROBADO, NOTABLE, SOBRESALIENTE, MATRICULA_DE_HONOR, NO_PRESENTADO };
        public static Notas clasificacionNotas(float nota) {
            String calificación = "";
            if (nota < 3.0) {
                calificación = String.valueOf(Notas.PERDIODERECHO);
            } else if ()

        }
    }
}
