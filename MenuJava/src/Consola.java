

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Consola {
    public static Scanner l= new Scanner(System.in);
    //Control
    public static void esperarTecla() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
    }
    public static void pausa() throws IOException {
        escribir("\n****************************************************************************************************\n");
        escribir("Presione cualquier tecla para Continuar....");
        esperarTecla();
    }

    //Entrada
    public static String leer() {
        return l.nextLine();
    }
    public static String leer(String etiqueta) {
        escribir(etiqueta);
        return leer();
    }
    public static <Tipo> Integer leerCon(String etiqueta) {
        do {
            try {
                return Integer.valueOf(leer(etiqueta));
            } catch (Exception e) {
                escribirEncabezado("ERROR: " + e.getMessage());
            }
        } while (true);
    }
    public static Integer leerValor(int VarDesde, int VarHasta, String prmEtiqueta)
    {
        Integer VarNum = leerCon(prmEtiqueta);
        if (VarNum < VarDesde || VarNum > VarHasta) { escribir("Error, solo se admiten valores entre [" + VarDesde + ".." + VarHasta + "]...\n"); }
        return VarNum;
    }

    //Salida
    public static void escribirEncabezado(String prmTexto)
    {
        escribirConSalto("****************************************************************************************************");
        escribirConSalto(prmTexto);
        escribirConSalto("****************************************************************************************************");
    }
    public static <Tipo> void escribir(Tipo Contenido) {
        System.out.print(Contenido);
    }
    public static <Tipo> void escribirConSalto(Tipo Contenido) {
        System.out.println(Contenido);
    }
    public static Integer leerValidando(int prmMayor, String prmEtiqueta) {
        Integer varNum = leerCon(prmEtiqueta);
        do {
            if (varNum>=prmMayor && esEntero(varNum.toString())) {
                return varNum;
            }
            if (varNum<prmMayor) {
                return -1;
            }
            escribirConSalto("Solo se pueden ingresar cifras exactas.....");
            varNum = leerCon(prmEtiqueta);
        } while (true);
    }
    public static boolean esEntero(String cad)
    {
        try
        {
            Double.parseDouble(cad);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }
}
