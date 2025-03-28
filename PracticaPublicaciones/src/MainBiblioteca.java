import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.salesianos.impuestos.CalculoImpuesto;
import net.salesianos.publicaciones.Publicaciones;
import net.salesianos.publicaciones.biblioteca.LibroDeTexto;
import net.salesianos.publicaciones.biblioteca.Novela;
import net.salesianos.publicaciones.biblioteca.Revista;

public class MainBiblioteca {
    // Lista global para almacenar las publicaciones
    private static List<Publicaciones> listaPublicaciones = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscribe una opción de las siguientes:" +
                    "\n a. Añadir una nueva revista." +
                    "\n b. Añadir un nuevo libro de texto." +
                    "\n c. Añadir una nueva novela." +
                    "\n d. Mostrar el listado de todas las publicaciones." +
                    "\n e. Selección de una publicación y cálculo de su precio en Canarias y en península." +
                    "\n f. Salir del programa");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Añadiendo una nueva revista...");
                    System.out.print("Título de la revista: ");
                    String titulo = sc.nextLine();

                    System.out.print("Número de páginas: ");
                    int numberPages = sc.nextInt();

                    System.out.print("Código ISBN: ");
                    int ISBNR = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Número de entrega de la revista: ");
                    int idMagazine = sc.nextInt();

                    System.out.print("Precio de distribución: ");
                    float distributionPrice = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Fecha de publicación de la última edición: ");
                    String publicationDate = sc.nextLine();

                    System.out.print("Cantidad de artículos: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    String[] articulos = new String[cantidad];
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Nombre del artículo " + (i + 1) + ": ");
                        articulos[i] = sc.nextLine();
                    }

                    Revista revista = new Revista(titulo, numberPages, ISBNR, distributionPrice, publicationDate,
                            idMagazine, articulos);
                    listaPublicaciones.add(revista);
                    System.out.println("Revista añadida con éxito.");
                    break;

                case "b":
                    System.out.println("Añadiendo un Libro de Texto...");
                    System.out.print("Título del libro: ");
                    String title = sc.nextLine();

                    System.out.print("Número de páginas: ");
                    int numeroPaginas2 = sc.nextInt();

                    System.out.print("Código ISBN: ");
                    int ISBNL = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Precio de distribución: ");
                    float distributionPrices = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Fecha de publicación de la última edición: ");
                    String publicationDate2 = sc.nextLine();

                    System.out.print("Nombre de la asignatura: ");
                    String asignatura = sc.nextLine();

                    System.out.print("Número de temas: ");
                    int numTemas = sc.nextInt();
                    sc.nextLine();

                    String[] temas = new String[numTemas];
                    for (int i = 0; i < numTemas; i++) {
                        System.out.print("Nombre del tema " + (i + 1) + ": ");
                        temas[i] = sc.nextLine();
                    }

                    LibroDeTexto libro = new LibroDeTexto(asignatura, temas, title, numeroPaginas2, ISBNL,
                            distributionPrices, publicationDate2);
                    listaPublicaciones.add(libro);
                    System.out.println("Libro de texto añadido con éxito.");
                    break;

                case "c":
                    System.out.println("Añadiendo una nueva novela...");
                    System.out.print("Título de la novela: ");
                    String titulo3 = sc.nextLine();

                    System.out.print("Número de páginas: ");
                    int numberPages3 = sc.nextInt();

                    System.out.print("Código ISBN: ");
                    int ISBNRN = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Precio de distribución: ");
                    float distributionPrice3 = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Fecha de publicación de la última edición: ");
                    String publicationDate3 = sc.nextLine();

                    System.out.println("Elige la temática de la novela:");
                    System.out.println("1. Novela Negra");
                    System.out.println("2. Novela Histórica");
                    System.out.println("3. Novela Juvenil");

                    int choice = sc.nextInt();
                    sc.nextLine();
                    String tematica = switch (choice) {
                        case 1 -> Novela.NOVELA_NEGRA;
                        case 2 -> Novela.NOVELA_HISTORICA;
                        case 3 -> Novela.NOVELA_JUVENIL;
                        default -> "Desconocida";
                    };

                    System.out.print("Nombre del autor: ");
                    String nombreAutor = sc.nextLine();

                    Novela novela = new Novela(tematica, nombreAutor, titulo3, numberPages3, ISBNRN, distributionPrice3,
                            publicationDate3);
                    listaPublicaciones.add(novela);
                    System.out.println("Novela añadida con éxito.");
                    break;

                case "d":
                    System.out.println("\nListado de todas las publicaciones:");
                    if (listaPublicaciones.isEmpty()) {
                        System.out.println("No hay publicaciones registradas.");
                    } else {
                        for (Publicaciones publicacion : listaPublicaciones) {
                            publicacion.hacerResumen();
                        }
                    }
                    break;

                case "e":
                    System.out.println("Selecciona una publicación para calcular su precio con impuestos.");
                    if (listaPublicaciones.isEmpty()) {
                        System.out.println("No hay publicaciones registradas.");
                        break;
                    }
                    for (int i = 0; i < listaPublicaciones.size(); i++) {
                        System.out.println((i + 1) + ". " + listaPublicaciones.get(i).titulo);
                    }
                    System.out.print("Ingrese el número de la publicación: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();

                    if (index >= 0 && index < listaPublicaciones.size()) {
                        Publicaciones selected = listaPublicaciones.get(index);
                        float precioBase = selected.preciodeDistribucion;
                        float precioConIVA = precioBase + CalculoImpuesto.calculateTaxIva();
                        float precioConIGIC = precioBase + CalculoImpuesto.calculateTax(precioBase);

                        System.out.println("Precio con IVA (21%): " + precioConIVA);
                        System.out.println("Precio con IGIC (7%): " + precioConIGIC);
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;

                case "f":
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        sc.close();
    }
}
