package utilidades;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

//trabalhando com Valores em reais
public class Utilidades {
     static NumberFormat numberFormat= new
             DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

     //receber um double pra retornar o valor acima formatado
     public static String doubleToString(Double value){
          return numberFormat.format(value);
     }

}
