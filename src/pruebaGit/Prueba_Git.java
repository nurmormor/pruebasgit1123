package pruebaGit;

import java.util.Scanner;

public class Prueba_Git {
	private static Scanner teclado = new Scanner(System.in);
	private static final int TOTAL_PARTIDOS = 4;

	public static void main(String[] args) {

		int partido1;
		int golesLocal, golesVisitante;
		int total1 = 0, total2 = 0, totalX = 0;
		partido1 = 1;
		while (partido1 <= TOTAL_PARTIDOS) {
			System.out.println("Introduce los goles del equipo local en el partido " + partido1);
			golesLocal = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce los goles del equipo visitante en el partido " + partido1);
			golesVisitante = Integer.parseInt(teclado.nextLine());
			if (golesLocal > golesVisitante) {
				System.out.println("Resultado de la quiniela en partido " + partido1 + " es 1");
				total1++;

			} else {
				if (golesVisitante > golesLocal) {
					System.out.println("Resultado de la quiniela en partido " + partido1 + " es 2");
					total2++;
				} else {
					System.out.println("Resultado de la quiniela en partido " + partido1 + " es X");
					totalX++;
				}
			}
			partido1 = partido1 + 1;
		}
		System.out.println("El porcentaje de 1 es: " + total1 * 100 / TOTAL_PARTIDOS + "%");
		System.out.println("El porcentaje de 2 es: " + total2 * 100 / TOTAL_PARTIDOS + "%");
		System.out.println("El porcentaje de X es: " + totalX * 100 / TOTAL_PARTIDOS + "%");

	}

}
