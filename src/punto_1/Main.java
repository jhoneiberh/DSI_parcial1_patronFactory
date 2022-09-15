package punto_1;

public class Main 
{
    public static void main(String[] args) 
    {
       Factory myFabrica = new Factory();
       
       ICamisetas myCamisaAdiddas = myFabrica.elaborar(Factory.ADIDAS);
       myCamisaAdiddas.crearCamiseta();
       
       
       ICamisetas myCamisaNike = myFabrica.elaborar(Factory.NIKE);
       myCamisaNike.crearCamiseta();
       
       
       ICamisetas myCamisaPuma = myFabrica.elaborar(Factory.PUMA);
       myCamisaPuma.crearCamiseta();
       
    }
    
}
