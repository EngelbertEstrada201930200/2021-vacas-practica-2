package src.peliculas;


import src.tienda.*;

public class VectorPelicula {
    private Pelicula[] peliculas = new Pelicula[50];
    private int siguienteCod;

    //Contructor
    public VectorPelicula(){
        siguienteCod = 1;

    }

    // Agregar Peliculas
    public void agregarPelicula(String nombrePelicula, String categoria, int anio){
        if(siguienteCod > 50){
            System.out.println("Lo siento!!. No se aceptan más clientes");

        }else {
            //Creamos nueva pelicula
            peliculas[(siguienteCod-1)] = new Pelicula(siguienteCod, nombrePelicula,  categoria, anio);
        }

        siguienteCod++;

    }

    public void agregarPelicula(){
        String nombrePelicula = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
        String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el año de la pelicula: ", false);
        agregarPelicula(nombrePelicula, categoria, anio);
    }

//Fin agregar Peliculas

    public void mostrarPelicula(){
        System.out.println("\n...PELICULAS...");
        for (int i = 0 ; i < (siguienteCod - 1); i++) {
            System.out.println(" "+ i +") "+peliculas[i].getInformacionPeliculas());
        }
        System.out.println("\n\n\n");
    }

//ordenamiento
    public void ordenarNombre(boolean ascendente){
        boolean ordenar = true;
        
        for(int i = 1; i < (siguienteCod-1); i++){
            for(int j = 0; j < (siguienteCod-1-i); j++){
                if(ascendente){
                    ordenar = (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) > 0);
                }else{
                    ordenar = (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) < 0);
                }
                
                if(ordenar){
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]=aux;
                }
            }
        }
    }
}