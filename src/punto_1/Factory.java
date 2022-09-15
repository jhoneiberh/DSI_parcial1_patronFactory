package punto_1;

public class Factory 
{
    public static final int NIKE = 1;
    public static final int ADIDAS = 2;
    public static final int PUMA = 3;

    public Factory() {
    }
    
    public ICamisetas elaborar(int tipoCamisa)
    {
        ICamisetas camisa;
        
        switch ( tipoCamisa ) 
        {
            case NIKE:
                camisa = new CamisetaNike();
                break;
            case ADIDAS:
                camisa = new CamisetaAdidas();
                break;
            case PUMA:
                camisa = new CamisetaPuma();
                break;
            default:
                camisa = null;
        }
        return camisa;
    }
}
