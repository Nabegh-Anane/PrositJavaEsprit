import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {
    // question 1
    int id;
    String lib;
    String brand;
    double price;
    Date dateExpiration;
    
    public Produit() {
        this.id = 0;
        this.lib = "";
        this.brand = "";
        this.price = 0.0;
        this.dateExpiration = new Date(); // date courante par defaut
    }


    public Produit(int id, String lib, String brand, double price, Date dateExpiration) {
        this.id = id;
        this.lib = lib;
        this.brand = brand;
        this.price = price;
        this.dateExpiration = dateExpiration;
    }


    public void afficher() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Identifiant : " + id);
        System.out.println("Libellé : " + lib);
        System.out.println("Marque : " + brand);
        System.out.println("Prix : " + price);
        System.out.println("Date d'expiration : " + sdf.format(dateExpiration));
        System.out.println("********************");
    }


    public void modifPrice(double price) {
        this.price = price;
    }


    public boolean isManquantInfos() {
        return this.price == 0.0;
    }


    @Override
    public String toString() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Produit [ID=" + id + ", Libellé=" + lib + ", Marque=" + brand + ", Prix=" + price + ", Date d'expiration=" + sdf.format(dateExpiration) + "]";
    }

    public static void main(String[] args) {
        // question 8
        Date date1 = new Date(2024 - 1900, 9, 30);
        Date date2 = new Date(2024 - 1900, 10, 5);
        Date date3 = new Date(2025 - 1900, 1, 15);

        // question 2 vers 8
        Produit a = new Produit(1021, "Lait", "Delice", 0.0, date1);
        Produit b = new Produit(2510, "Yaourt", "Vitalait", 0.0, date2);
        Produit c = new Produit(3250, "Tomate", "Sicam", 1.2, date3);

        // question 3
        a.afficher();
        b.afficher();
        c.afficher();

        // question 4 & 5
        if (a.isManquantInfos()) {
            a.modifPrice(0.7);
        }
        if (b.isManquantInfos()) {
            b.modifPrice(0.5);
        }

        // question 6
        System.out.println("Produits modifiés:");
        if (!a.isManquantInfos()) {
            a.afficher();
        }
        if (!b.isManquantInfos()) {
            b.afficher();
        }
        if (!c.isManquantInfos()) {
            c.afficher();
        }

        // question 7
        System.out.println("Produits créés:");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
