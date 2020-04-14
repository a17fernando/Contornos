import java.util.HashMap;
import java.util.Map;
public class Maps {

    public static void main(String[] args) {
        Map<String,Double> hm= new HashMap<>();
        hm.put("Elías", new Double(1500));
       //mejor con  autoboxing 
        hm.put("Román", 1900.0);
        hm.put("Telma", 2400.0);
        System.out.println("Sueldo de Román: "+ hm.get("Román")); 
        System.out.println("Está en el mapa la llave Telma?: "+ hm.containsKey("Telma"));
        System.out.println("Está en el mapa el valor Telma?: "+ hm.containsValue("Telma"));
        Double d=1900.0;
        System.out.println("Está en el mapa el valore 1900?: "+ hm.containsValue(d));
        d=1899.98; 
        System.out.println("Está en el mapa el valor 1899.98?: "+ hm.containsValue(d));
    }
}
