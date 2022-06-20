package cuestionario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class InicializarPreguntasYRecord {

    public static void main(String[] args) {

        List<Pregunta> preguntas = new ArrayList<Pregunta>();
        Pregunta pregunta;
        String[] respuestas;

        respuestas = new String[]{"1492", "1520", "1898", "1710"};
        pregunta = new Pregunta("¿En qué año se descubrió América?", respuestas, 0);
        preguntas.add(pregunta);

        respuestas = new String[]{"Verdadero", "Falso"};
        pregunta = new Pregunta("El protagonista de Blade Runner es Harrison Ford", respuestas, 0);
        preguntas.add(pregunta);

        respuestas = new String[]{"Isabel y Carlos", "Juana y Fernando", "Isabel y Fernando"};
        pregunta = new Pregunta("Los Reyes Católicos se llamaban...", respuestas, 2);
        preguntas.add(pregunta);

        respuestas = new String[]{"Francisco López", "Francisco Ibáñez", "Francisco Gutiérrez"};
        pregunta = new Pregunta("El autor de Mortadelo y Filemón es...", respuestas, 1);
        preguntas.add(pregunta);

        respuestas = new String[]{"dBASE", "Clipper", "MySQL"};
        pregunta = new Pregunta("El primer sistema de gestión de base de datos para PC fue...", respuestas, 0);
        preguntas.add(pregunta);

        respuestas = new String[]{"Juan Carlos I", "Cervantes", "Homero"};
        pregunta = new Pregunta("La Odisea fue escrita por...", respuestas, 2);
        preguntas.add(pregunta);

        respuestas = new String[]{"Ave", "Mamimefero", "Pez", "Anfibio"};
        pregunta = new Pregunta("La ballena es un/a...", respuestas, 1);
        preguntas.add(pregunta);

        respuestas = new String[]{"Madrid", "Valencia", "Asturias", "Barcelona"};
        pregunta = new Pregunta("La Sagrada Familia se encuentra en...", respuestas, 3);
        preguntas.add(pregunta);

        respuestas = new String[]{"Cosa", "Avión", "Producto", "Casa"};
        pregunta = new Pregunta("Al resultado de una multiplicacion se le llama...", respuestas, 1);
        preguntas.add(pregunta);

        respuestas = new String[]{"Barak Obama", "Joe Biden", "Donald trump", "Hillary Clinton"};
        pregunta = new Pregunta("El presindente de EEUU se llama...", respuestas, 1);
        preguntas.add(pregunta);

        System.out.println("Creando fichero de preguntas... ");
        try ( FileOutputStream fos = new FileOutputStream("preguntas.dat");  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(preguntas);
            System.out.println("OK");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR, fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("ERROR de entrada-salida del fichero.");
        }

        System.out.println("Creando fichero de record... ");
        try ( FileOutputStream fos = new FileOutputStream("record.dat");  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(0);
            System.out.println("OK");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR, fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("ERROR de entrada-salida del fichero.");
        }

    }

}
