package DB40;

import componentes.personas.Condecorados;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VolcarInfo {

    public List<Condecorados> ListadeCondecorados(String archivoQueLeer) throws IOException {
        List<Condecorados> ListadeCondecorados = new ArrayList<>();
        try (Reader reader = new FileReader(archivoQueLeer);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            // Obtener el encabezado del CSV
            Map<String, Integer> headerMap = csvParser.getHeaderMap();

            // Obtener los nombres de las columnas
            List<String> columnNames = new ArrayList<>(headerMap.keySet());

            // Procesar cada registro en el CSV
            for (CSVRecord csvRecord : csvParser) {
                // Obtener los valores de las columnas
                String lastName = csvRecord.get(headerMap.get("LAST NAME"));
                String firstName = csvRecord.get(headerMap.get("FIRST NAME"));
                String officerOrEnlistedIndividual = csvRecord.get(headerMap.get("OFFICER OR ENLISTED INDIVIDUAL"));
                String typeOfActionCommendedByOriginator = csvRecord.get(headerMap.get("TYPE OF ACTION COMMENDED BY THE ORIGINATOR"));
                String nameofApprovedAward = csvRecord.get(headerMap.get("NAME OF APPROVED AWARD"));

                // Crear objeto Condecorados y agregarlo a la lista
                Condecorados condecorados = new Condecorados(lastName, firstName, officerOrEnlistedIndividual, typeOfActionCommendedByOriginator, nameofApprovedAward);
                ListadeCondecorados.add(condecorados);
            }
        }
        return ListadeCondecorados;
    }
}
