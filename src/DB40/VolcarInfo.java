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
    String archivoQueLeer = "C:\\Users\\anouar\\Desktop\\MEDACMuProgWaW\\Heroess.csv";

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


                Date dateAwardApproved;
                try {
                    dateAwardApproved = new Date(dateFormat.parse(fields[4]).getTime());
                } catch (ParseException e) {

                    System.err.println("Error :" + lineas);
                    continue;
                }

                Condecorados condecorados = new Condecorados(fields[0], fields[1], fields[2], fields[3], dateAwardApproved);

                // Agregar la instancia a la lista
                ListadeCondecorados.add(condecorados);
                insertar.Cargarcondyheroes(ListadeCondecorados);

            }
            insertar.cerrarConeccion();
        }

        return ListadeCondecorados;
    }



}
