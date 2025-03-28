package net.salesianos.publicaciones;

public class Publicaciones {
    public String titulo;
    protected int numeroDePaginas;
    protected int ISBN;
    public float preciodeDistribucion;
    protected String FechaEdicion;

    

    public Publicaciones(String titulo, int numeroDePaginas, int iSBN, float preciodeDistribucion, String fechaEdicion) {
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.ISBN = iSBN;
        this.preciodeDistribucion = preciodeDistribucion;
        this.FechaEdicion = fechaEdicion;
    }



    // Escribimos voluntariamente el método hacerResumen aquí para luego sobreescribirlo con un 
    // override en las siguientes clases...
    public void hacerResumen(){
        System.out.println("el libro fue gustado por mucha gente");
    }
}
