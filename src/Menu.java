import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private String m_monedaActual;
    private String m_monedaACambiar;
    private double m_montoActual;

    public String getM_monedaActual() {
        return m_monedaActual;
    }

    public String getM_monedaACambiar() {
        return m_monedaACambiar;
    }

    public double getM_monto() {
        return m_montoActual;
    }

    //public void mostrarInterfazUsuario(HashMap<String, Double> data)
    
    public void menuu(HashMap<String, Double> data)
    {

        Scanner scanner = new Scanner(System.in);

        int monedaActual = 0;
        while(monedaActual == 0)
        {
            System.out.println("*****************************");
            System.out.println("Ingrese el tipo de moneda");
            System.out.println("ARS (Peso Argentino)");
            System.out.println("USD (Dolar Estado Unidense)");
            System.out.println("PEN (Sol Peruano)");

            String monedaByUser  = scanner.nextLine();
            if(data.containsKey(monedaByUser))
            {
                m_monedaActual=monedaByUser;
                monedaActual = 1;
            }

        }
        while (true) {
            System.out.println("*****************************");
            System.out.println("Ingrese monto:");
            String input = scanner.nextLine(); // Leer la entrada como String
            try {
                double montoByUser = Double.parseDouble(input);
                if (montoByUser >= 0) {
                    m_montoActual = montoByUser;
                    break;
                } else {
                    System.out.println("Monto inválido, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        int monedaACambiar = 0;
        while(monedaACambiar == 0)
        {
            System.out.println("*****************************");
            System.out.println("Escoja la moneda a cambiar");

            for(String currentKey :  data.keySet())
            {
                System.out.println(currentKey+" ");
            }

            String monedaCambio  = scanner.nextLine();
            if(data.containsKey(monedaCambio))
            {
                m_monedaACambiar = monedaCambio;
                monedaACambiar = 1;
            }
        }
    }

    void MostrarResultados(double MontoCambiado)
    {
        System.out.println("****************************");
        System.out.println("El monto ingresado fue "+ m_montoActual +" en la moneda "+ getM_monedaActual());
        System.out.println("El cambio es de : " + MontoCambiado + " en la moneda escogida, " + getM_monedaACambiar());
    }
}
