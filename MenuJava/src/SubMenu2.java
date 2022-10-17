public class SubMenu2 extends Menu{
    protected  void Configurar()
    {
        atrItems.clear();
        atrItems.add("    MENÚ JUEGO   ");
        atrItems.add("Nueva partida");
        atrItems.add("Cargar partida");
        atrItems.add("Configuracion");
        atrItems.add("Creditos");
        atrItems.add("Salir");
    }
    protected void Procesar()
    {
        switch (atrOpccionElegida)
        {
            case 1:
            {
                Consola.escribirEncabezado("Creando nueva partida...");
                break;
            }
            case 2:
            {
                Consola.escribirEncabezado("Cargando partida..");
                break;
            }
            case 3:
            {
                Consola.escribirEncabezado("Video \nIdioma \nPantalla \nGuardar cambios \nSalir");
                break;
            }
            case 4:
            {
                Consola.escribirEncabezado("Desarrollador: Guerrilla Games.");
                break;
            }
            case 5: Consola.escribirEncabezado("Saliendo del submenu juego..."); break;
            default: Consola.escribirEncabezado("El Valor de la opcion indicada no existe..."); break;
        }


    }
}
