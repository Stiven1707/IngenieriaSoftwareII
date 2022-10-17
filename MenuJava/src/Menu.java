import java.util.ArrayList;

public class Menu {
    protected int atrOpccionElegida = -1;
    private int atrOpccionSalir = -1;
    protected ArrayList<String> atrItems = new ArrayList<String>();
    public Menu()
    {
        Iterar();
    }
    public final void imprimir()
    {
        Consola.escribirEncabezado(atrItems.get(0));
        for (int varIndice = 1; varIndice < atrItems.size(); varIndice++)
        {
            Consola.escribirConSalto(varIndice+"."+atrItems.get(varIndice));
        }
        Consola.escribirConSalto("****************************************************************************************************");
    }
    public final void Iterar()
    {

        Configurar();
        atrOpccionSalir = atrItems.size() - 1;
        do
        {
            imprimir();
            atrOpccionElegida = Consola.leerCon("Ingrese un valor Entre [1.." + atrOpccionSalir + "] para <Opcion>:");
            Procesar();
            Configurar();
            atrOpccionSalir = atrItems.size() - 1;

        } while (atrOpccionElegida != atrOpccionSalir);
    }

    protected  void Configurar() { }
    protected  void Procesar() { }

}
