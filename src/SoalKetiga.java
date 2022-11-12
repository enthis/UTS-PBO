public class SoalKetiga {
    public static void main(String[] args) {
        DaftarNama dn = new DaftarNama();
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
