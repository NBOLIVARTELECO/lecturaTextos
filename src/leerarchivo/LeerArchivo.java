
package leerarchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {
        
        String archivo = "C:\\Users\\locon\\OneDrive\\Documentos\\NetBeansProjects\\LeerArchivo\\src\\leerarchivo\\datos.txt";
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            br.close();
            fr.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}