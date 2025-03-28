package net.salesianos.publicaciones.biblioteca;

import net.salesianos.publicaciones.Publicaciones;

public class Novela extends Publicaciones {
    public static final String NOVELA_NEGRA ="";
    public static final String NOVELA_HISTORICA = "";
    public static final String NOVELA_JUVENIL = "";

    protected String tematica;
    protected String autor;

    // Valores permitidos para la temática
    //public static String NOVELA_NEGRA = "novela negra";
    //public static String NOVELA_HISTORICA = "novela historica";
    //public static String NOVELA_JUVENIL = "novela juvenil";


    // Valores con un 'enum'
    public enum Temas {
        NOVELA_NEGRA, NOVELA_JUVENIL, NOVELA_HISTORICA
    }



    public Novela(String tematica, String autor,String titulo,int numeroDePaginas, int iSBN, float preciodeDistribucion, String fechaEdicion) {
        super(titulo, numeroDePaginas, iSBN, preciodeDistribucion, fechaEdicion);
        this.tematica = tematica;
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static String getNovelaNegra() {
        return NOVELA_NEGRA;
    }

    public static String getNovelaHistorica() {
        return NOVELA_HISTORICA;
    }

    public static String getNovelaJuvenil() {
        return NOVELA_JUVENIL;
    }

    @Override
    public void hacerResumen() {
        System.out.println(
                "--------------------------------------===" + this.titulo + "===—----------------------------------");
        System.out.println("* Temática: " + this.tematica);
        System.out.println("* Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroDePaginas);
        System.out.println("* Precio de distribución: " + this.preciodeDistribucion);
        System.out.println("========================================================");
    }

}
