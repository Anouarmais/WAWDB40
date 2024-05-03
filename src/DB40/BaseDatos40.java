package DB40;



import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import componentes.personas.Condecorados;

import java.util.List;

public class BaseDatos40 {

     ObjectContainer HeroesyGenerales;
    public BaseDatos40() {

         HeroesyGenerales = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration() , "HeoresYGenerales");
    }
    public  void cerrarConeccion(){
        HeroesyGenerales.close();

    }
    public void Cargarcondyheroes(List<Condecorados> condecoradosList){
        try{
            for(Condecorados condecorados : condecoradosList){
                HeroesyGenerales.store(condecorados);
            }

        } catch (DatabaseClosedException e) {
            throw new RuntimeException(e);
        } catch (DatabaseReadOnlyException e) {
            throw new RuntimeException(e);
        }

    }
    public void borrarBBDD(){
        try {
            // Obtener todos los objetos de la base de datos
            ObjectSet<Condecorados> resultados = HeroesyGenerales.query(Condecorados.class);

            // Iterar sobre los resultados y eliminar cada objeto
            while (resultados.hasNext()) {
                Condecorados condecorados = resultados.next();
                HeroesyGenerales.delete(condecorados);

            }
            System.out.println("Se han eliminado todos los objetos de la base de datos.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void verBBDD() {
        try {
            Condecorados consulta = new Condecorados(null, null, null, null, null);

            // Realizar la consulta en la base de datos
            ObjectSet<Condecorados> resultados = HeroesyGenerales.queryByExample(consulta);

            while (resultados.hasNext()) {
                Condecorados condecorados = resultados.next();
                System.out.println(condecorados);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
