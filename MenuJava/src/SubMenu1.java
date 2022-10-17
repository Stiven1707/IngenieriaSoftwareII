public class SubMenu1 extends Menu{
    protected  void Configurar()
    {
        atrItems.clear();
        atrItems.add("    MENÚ LOGROS   ");
        atrItems.add("Exploracion");
        atrItems.add("Recetas");
        atrItems.add("Reliquias");
        atrItems.add("Armas");
        atrItems.add("Stats");
        atrItems.add("Salir");
    }
    protected void Procesar()
    {
        switch (atrOpccionElegida)
        {
            case 1:
            {
                Consola.escribirEncabezado("Banges 100% \nHykros 20% \nNavia 89% \nWarren 75%");
                break;
            }
            case 2:
            {
                Consola.escribirEncabezado("Principal 5/12 \nSopas 3/8 \nPasabocas 13/13 \nPostres 9/17 \nBebidas 14/25");
                break;
            }
            case 3:
            {
                Consola.escribirEncabezado("SSR 5/8 \nSR 11/12");
                break;
            }
            case 4:
            {
                Consola.escribirEncabezado("SSR 8/12 \nSR 5/5 \nR4/4");
                break;
            }
            case 5:
            {
                Consola.escribirEncabezado("FC 29249 \nPS 389657 \nCrit 3476 \nAtq. Electrico 6168 \nRes 650 \nSupresor v5.3");
                break;
            }
            case 6: Consola.escribirEncabezado("Saliendo del submenu logros..."); break;
            default: Consola.escribirEncabezado("El Valor de la opcion indicada no existe..."); break;
        }


    }
}
