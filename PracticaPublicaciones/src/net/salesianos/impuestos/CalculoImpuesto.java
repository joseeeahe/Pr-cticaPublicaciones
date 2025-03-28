package net.salesianos.impuestos;

public class CalculoImpuesto{
    // esta es la clase que usaremos para los aranceles
    /**
     * 😆 "Papá, papá, ¿por qué no puedo heredar la finca?"
     * 👨‍💻 "Porque la declaré como privada, hijo."
     */

    float price;
    final static float TAX_IGIC = 0.07f;

    //función para calcular el IGIC (7%)
    public static float calculateTax(float price) {
        return price * TAX_IGIC;
    }
    static float basePrice;
    final static float TAX_IVA = 0.21f; // 21% de IVA

    //función para calcular el IVA (21%)
    public static float calculateTaxIva(){
        return basePrice * TAX_IVA;
    }
}