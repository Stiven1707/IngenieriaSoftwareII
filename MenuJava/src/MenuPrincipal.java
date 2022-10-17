import java.io.IOException;

public class MenuPrincipal extends Menu{

    protected  void Configurar()
    {
        atrItems.clear();
        atrItems.add("    MENÚ PRINCIPAL   ");
        atrItems.add("Logros");
        atrItems.add("Abrir Juego");
        atrItems.add("Salir");
    }
    protected void Procesar()
    {
        switch (atrOpccionElegida)
        {
            case 1:
            {
                new SubMenu1();
                break;
            }
            case 2:
            {
                new SubMenu2();;
                break;
            }
            case 3: Consola.escribirEncabezado("Saliendo de la Aplicacion..."); break;
            default: Consola.escribirEncabezado("El Valor de la opcion indicada no existe..."); break;
        }
        try {
            Consola.pausa();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
