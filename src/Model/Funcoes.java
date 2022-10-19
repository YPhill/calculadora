
package Model;


public class Funcoes {
    
    public static void soma(){
    String X = View.Inicio_GUI.valor1_TXT.getText();
    int valor1 = Integer.parseInt(X);
    
    X = View.Inicio_GUI.valor2_TXT.getText();
    int valor2 = Integer.parseInt(X);
    
    int res = valor1 + valor2;
    
    View.Inicio_GUI.resultado_TXT.setText(String.valueOf(res));
    }
    
    
    public static void subtracao(){
        
    String X = View.Inicio_GUI.valor1_TXT.getText();
    int valor1 = Integer.parseInt(X);
    
    X = View.Inicio_GUI.valor2_TXT.getText();
    int valor2 = Integer.parseInt(X);
    
    int res = valor1 - valor2;
    
    View.Inicio_GUI.resultado_TXT.setText(String.valueOf(res));
    }
    
    
    public static void multiplicacao(){
        
    String X = View.Inicio_GUI.valor1_TXT.getText();
    int valor1 = Integer.parseInt(X);
    
    X = View.Inicio_GUI.valor2_TXT.getText();
    int valor2 = Integer.parseInt(X);
    
    int res = valor1 * valor2;
    
    View.Inicio_GUI.resultado_TXT.setText(String.valueOf(res));
    }
    
    
    
   public static void divisao(){
        
    String X = View.Inicio_GUI.valor1_TXT.getText();
    int valor1 = Integer.parseInt(X);
    
    X = View.Inicio_GUI.valor2_TXT.getText();
    int valor2 = Integer.parseInt(X);
    
    int res = valor1 / valor2;
    
    View.Inicio_GUI.resultado_TXT.setText(String.valueOf(res));
    }
    
    
    
    
}
