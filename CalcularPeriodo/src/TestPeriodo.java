import java.time.LocalDate;
import java.time.Month;

public class TestPeriodo {

	public static void main(String[] args) {
		CalcularPeriodo cp1 = new CalcularPeriodo();
		
		LocalDate fecha = LocalDate.of(2002, Month.MAY, 01);
		cp1.calcularPeriodo("El descubrimiento de América", fecha);
		
	}

}
