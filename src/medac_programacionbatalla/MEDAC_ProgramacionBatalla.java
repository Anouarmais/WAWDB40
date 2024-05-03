/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacionbatalla;

import DB40.BaseDatos40;
import DB40.VolcarInfo;
import batallas.Batalla;
import componentes.animales.Heroes;
import componentes.personas.Condecorados;
import excepciones.batallas.NombreExistenteException;

import java.io.IOException;
import java.util.List;

/**
 * @author danie
 */
public class MEDAC_ProgramacionBatalla {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String archivoQueLeer = "Heroes.csv";
     /*   VolcarInfo nnn = new VolcarInfo();

        try {
            List<Condecorados> condecoradosList = nnn.ListadeCondecorados(archivoQueLeer);

            for (Condecorados condecorados : condecoradosList) {
                System.out.println(condecorados);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
//        String test = ExploradorFicheros.leerFichero();
        // Batalla batalla = new Batalla();

       // Heroes ascdas = new Heroes();
    //    System.out.println(ascdas);

        /*VolcarInfo ho = new VolcarInfo();
        ho.ListadeCondecorados(archivoQueLeer);*/


       // BaseDatos40 SSS = new BaseDatos40();
     //   SSS.borrarBBDD();
        VolcarInfo volcarInfo = new VolcarInfo();


        try {
            List<Condecorados> condecoradosList = volcarInfo.ListadeCondecorados(archivoQueLeer);

            // Imprimir los objetos Condecorados utilizando el método toString()
            for (Condecorados condecorados : condecoradosList) {
                System.out.println(condecorados.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SSS.cerrarConeccion();

    }}

    

 
