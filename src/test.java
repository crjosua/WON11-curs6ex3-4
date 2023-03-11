public class test {
    public static void main(String[] args) {
        Product p1 = new Product("Banana", 5, 0, "Fruits");
        Product p2 = new Product("Apple", 1, 4, "Fruits");
        Product p3 = new Product("Water", 2, 12, "Food");
        if (p1.hasStock() == true) {
            System.out.println(p1.getName() + " este pe stoc");
        } else {
            System.out.println(p1.getName() + " nu este pe stoc");
        }

        if (p1.isCategory("Food") == true) {
            System.out.println(p1.getName() + " face parte din categorie");
        } else {
            System.out.println(p1.getName() + " nu face parte din categorie");
        }
        if (p2.isCategory("Fruits") == true) {
            System.out.println(p2.getName() + " face parte din categorie");
        } else {
            System.out.println(p2.getName() + " nu face parte din cateogrie");
        }
        if (p3.isCategory("Food") == true) {
            System.out.println(p3.getName() + " face parte din categorie");
        } else {
            System.out.println(p3.getName() + " nu face parte din categorie");
        }
    }
}