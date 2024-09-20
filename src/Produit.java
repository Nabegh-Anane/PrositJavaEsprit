public class Produit {
    int id;
    String lib;
    String brand;
    double Price;

    public Produit() {
        this.id = 0;
        this.lib = "";
        this.brand = "";
        this.Price = 0.0;
    }

    public Produit(int id, String lib, String brand, double Price) {
        this.id = id;
        this.lib = lib;
        this.brand = brand;
        this.Price = Price;
    }

    public void afficher() {
        System.out.println("Identifiant : " + id);
        System.out.println("Libellé : " + lib);
        System.out.println("Marque : " + brand);
        System.out.println("Price : " + Price);
        System.out.println("********************");
    }

    public void modifPrice(double Price) {
        this.Price = Price;
    }

    public boolean iSmanquantInfos() {
        return this.Price == 0.0;
    }
    public static void main(String[] args) {
        Produit a = new Produit(1021, "Lait", "Delice", 0.0);
        Produit b = new Produit(2510, "Yaourt", "Vitalait", 0.0);
        Produit c = new Produit(3250, "Tomate", "Sicam", 1.2);

        // question 4
        a.afficher();
        b.afficher();
        c.afficher();

        // question 4
        a.modifPrice(0.7);


        //question 5
        if (a.iSmanquantInfos()) {
            a.modifPrice(0.7);
        }
        if (b.iSmanquantInfos()) {
            b.modifPrice(0.5);
        }

        //question 7 Afficher les produits modifiés.
        System.out.println("Produits modifiés:");
        if (!a.iSmanquantInfos()) {
            a.afficher();
        }
        if (!b.iSmanquantInfos()) {
            b.afficher();
        }
        if (!c.iSmanquantInfos()) {
            c.afficher();
        }
    }
}









