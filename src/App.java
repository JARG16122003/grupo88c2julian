public class App {
        
    
    private String nombre;
    private int identificacion;
    private double estatura;
    private float peso;
    private char sexo;
    private boolean estaVacunado;

    


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    //operadores aritmeticos
        int resultado=45+12;
        resultado=45-12;
        resultado=45*12;
        resultado=45/12;
        resultado=45%12;
        //operadores unarios
        resultado++;
        resultado--;
        boolean respuesta=true;
        //algebra booleana
        respuesta=5<8;
        respuesta=5>8;
        respuesta=5>=8;
        respuesta=5<=8;
        respuesta=5==8;
        respuesta=5!=8;
        //operadores logicos
        respuesta=5<8 && 4>=6;
        respuesta=5<8 || 4>=6;
        
        //estructuras de control
        //---condicionales---
        int llave=2;
      switch (llave) {
          case 1:    
              break;
          case 2:
              break;    
      
          default:
              break;
            }
            //---ciclos,repetitivas,bucles---
        while (llave>5) {
            
        }
        do {
            
        } while (llave>5);
    
        for (String string : args) {
            
        }
        //declaracion de una variable ; condicion ; incremento
        for (int i = 0; i < args.length; i++) {
            
        }
    
        }
    }
    



