package src.peliculas;
/**
 * Pelicula
 */

public class Pelicula {
    private int id;
    private String nombrePelicula;
    private String categoria;
    private int anio; 


    public Pelicula(int id, String nombrePelicula, String categoria,  int anio){
        this.id = id;
        this.nombrePelicula = nombrePelicula;
        this.categoria = categoria;
        this.anio = anio;

    }

    public Pelicula(int id, String nombrePelicula, String categoria){
        this(id, nombrePelicula, categoria, 0);
    }

    //Getter y Setter

    public int gerId(){
        return id;
    }

    public String getNombrePelicula(){
        return nombrePelicula;
    }
    
    public int getAnio(){
        return anio;
    }

    public String getCategoria(){
        return categoria;
    }

    //Fin

    //Imprimir peliculas
    public String getInformacionPeliculas(){
        String resultado = "Id: "+ id +" -- Nombre Pelicula: "+ nombrePelicula +" -- Categoria: "+ categoria +" -- Año: "+anio;
        return resultado;

    }
}
