package org.compi2.codigo3d;

/**
 *
 * @author esvux
 */
public class GeneradorDeCompiladores {
    
    public static void main(String[] args) {
        generarCompilador();
    }
    
    private static void generarCompilador(){
        try {
            String ruta = "C:\\Users\\BARRIOS\\Documents\\NetBeansProjects\\MakerC3D-master\\MakerC3D_201020588\\MakerC3D-master\\src\\org\\compi2\\codigo3d\\parser\\";
            String opcFlex[] = { ruta + "lexico.flex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
