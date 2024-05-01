package DB40;

import componentes.personas.Condecorados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class VolcarInfo {

    public List<Condecorados> ListadeCondecorados(String archivoQueLeer) throws IOException {
        List<Condecorados> ListadeCondecorados = new ArrayList<>();
        BaseDatos40 insertar = new BaseDatos40();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoQueLeer))) {
            String lineas;
            boolean headerSkipped = false;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            while ((lineas = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                String[] fields = lineas.split(",");

                // Verificar que la línea tenga al menos 26 campos antes de acceder al campo en el índice 25
                if (fields.length < 26) {
                    System.err.println("Error: la línea no tiene suficientes campos: " + lineas);
                    continue;
                }

                Date dateAwardApproved;
                try {
                    dateAwardApproved = new Date(dateFormat.parse(fields[25]).getTime());
                } catch (ParseException e) {
                    System.err.println("Error al parsear la fecha en la línea: " + lineas);
                    continue;
                }

                // Extraer los campos relevantes
                String lastName = fields[0];
                String firstName = fields[1];
                String recommendedAward = fields[11];
                String typeOfActionCommendedByOriginator = fields[13];

                // Crear instancia de Condecorados y agregarla a la lista
                Condecorados condecorados = new Condecorados(lastName, firstName, recommendedAward, typeOfActionCommendedByOriginator, dateAwardApproved);
                ListadeCondecorados.add(condecorados);

                // Insertar en la base de datos
                insertar.Cargarcondyheroes(ListadeCondecorados);
            }
            insertar.cerrarConeccion();
        }
        return ListadeCondecorados;
    }
}
