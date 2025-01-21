import java.util.HashMap;

public class CambioMoneda{

    private HashMap <String ,Double> m_data = new HashMap<>();

    public CambioMoneda( ){
    }

    public void agregarDatos(String moneda , double valor)
    {
        m_data.put(moneda,valor);
    }
    public boolean contieneMoneda(String moneda)
    {
        if(m_data.containsKey(moneda))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public double obtenerCambio(String moneda)
    {
       return m_data.get(moneda);
    }

    public HashMap <String ,Double> obtenerData()
    {
        return m_data;
    }
}
