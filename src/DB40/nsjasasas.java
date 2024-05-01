package DB40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class nsjasasas {
    public static void main(String[] args) {
        String archivoQueLeer = "C:\\Users\\anouar\\Desktop\\MEDACMuProgWaWDB40\\Heroes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoQueLeer))) {
            String line;
            boolean headerFound = false;

            // Leer el archivo línea por línea
            while ((line = br.readLine()) != null) {
                // Si aún no se ha encontrado el encabezado y la línea coincide con los encabezados esperados
                if (!headerFound && line.startsWith("FIRST NAME") && line.contains("RECOMMENDED AWARD") &&
                        line.contains("TYPE OF ACTION COMMENDED BY THE ORIGINATOR") && line.contains("DATE AWARD APPROVED")) {
                    // Marcar que se encontró el encabezado
                    headerFound = true;
                    // Imprimir el encabezado
                    System.out.println(line);
                } else if (headerFound) {
                    // Si ya se encontró el encabezado, imprimir líneas que cumplan con el formato esperado
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
