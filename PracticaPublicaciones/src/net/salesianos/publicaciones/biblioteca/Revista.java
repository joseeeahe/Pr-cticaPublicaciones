package net.salesianos.publicaciones.biblioteca;

import net.salesianos.publicaciones.Publicaciones;

public class Revista extends Publicaciones {
    protected int numerorevista;
    protected String[] nombreDeLosArticulos;

    
   

    public Revista(String titulo, int numeroDePaginas, int iSBN, float preciodeDistribucion, String fechaEdicion,
            int numerorevista, String[] nombreDeLosArticulos) {
        super(titulo, numeroDePaginas, iSBN, preciodeDistribucion, fechaEdicion);
        this.numerorevista = numerorevista;
        this.nombreDeLosArticulos = nombreDeLosArticulos;
    }

    public int getNumerorevista() {
        return numerorevista;
    }

    public void setNumerorevista(int numerorevista) {
        this.numerorevista = numerorevista;
    }

    public String[] getNombreDeLosArticulos() {
        return nombreDeLosArticulos;
    }

    public void setNombreDeLosArticulos(String[] nombreDeLosArticulos) {
        this.nombreDeLosArticulos = nombreDeLosArticulos;
    }


    @Override
    public void hacerResumen() {
        System.out.println(
                "--------------------------------------===" + this.titulo + "===—----------------------------------");
        System.out.println("* Número de la revista: " + this.numerorevista);
        System.out.println("* Lista de artículos: ");
        System.out.println("\t" + this.nombreDeLosArticulos);
        System.out.println("\t" + this.nombreDeLosArticulos);
        System.out.println("* Precio de distribución: " + this.preciodeDistribucion);

        System.out.println("========================================================");
    }
}