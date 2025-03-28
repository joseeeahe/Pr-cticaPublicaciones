package net.salesianos.publicaciones.biblioteca;

import net.salesianos.publicaciones.Publicaciones;

public class LibroDeTexto extends Publicaciones{
    protected String asignatura;
    protected String[] temas;

    public LibroDeTexto(String asignatura, String[] temas,String titulo,int numeroDePaginas, int iSBN, float preciodeDistribucion, String fechaEdicion)  {
        super(titulo, numeroDePaginas, iSBN, preciodeDistribucion, fechaEdicion);
        this.asignatura = asignatura;
        this.temas = temas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    @Override
    public void hacerResumen() {
        System.out.println(
                "--------------------------------------===" + this.titulo + "===—----------------------------------");
        System.out.println("* Asignatura: " + this.asignatura);
        System.out.println("* Lista de temas: ");
        System.out.println("\t" + this.temas[0]);
        System.out.println("\t" + this.temas[1]);
        System.out.println("* Precio de distribución: " + this.preciodeDistribucion);
        System.out.println("========================================================");
    }
}
