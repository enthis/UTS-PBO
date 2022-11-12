public class SoalKeempat {
    public static void main(String[] args) {
        DaftarNamaKeEmpat dn = new DaftarNamaKeEmpat();
        System.out.println("Point A :");
        dn.getNamaWithSearch();
        System.out.println("\n----------------------");

        System.out.println("Point B :");
        dn.getNamaWithSort(1);
        System.out.println("\n----------------------");

        System.out.println("Point C :");
        dn.getNamaWithSort(0);
        System.out.println("\n----------------------");
        
        
    }
}
