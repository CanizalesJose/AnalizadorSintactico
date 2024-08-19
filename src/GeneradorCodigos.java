


import java.io.File;
import java.nio.file.*;

public class GeneradorCodigos {
    public static void main(String[] args)throws Exception{
        String ruta1 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\Lexer.flex";
        String ruta2 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\LexerCup.flex";
        String [] rutaS = {"-parser", "Sintax", "C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\Sintax.cup"};
        GenerarCodigos(ruta1, ruta2, rutaS);
    }
    public static void GenerarCodigos(String ruta1, String ruta2, String[] rutaS)throws Exception{
        File archivo;
        archivo = new File(ruta1);
        //jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\sym.java");
        Path rutaSintax = Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\Sintax.java");
        
        if (Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        if (Files.exists(rutaSintax)){
            Files.delete(rutaSintax);
        }
            
        
        Files.move(
                Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\sym.java"),
                Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\sym.java")
        );
        Files.move(
                Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\Sintax.java"),
                Paths.get("C:\\Users\\DELL\\Documents\\NetBeansProjects\\ProyectoAnalizador\\src\\Sintax.java")
        );
    }
    
}
