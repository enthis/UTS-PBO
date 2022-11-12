import java.util.*;
public class DaftarNama {
    String[] nama = new String[9];
    DaftarNama(){
        nama[0] = "Zainab";
        nama[1] = "Yunarso";
        nama[2] = "Jojon";
        nama[3] = "Tinatun";
        nama[4] = "Qinanti";
        nama[5] = "Mintarso";
        nama[6] = "Janah";
        nama[7] = "Jonathan";
        nama[8] = "Junaidi";
    }
    public void getNamaWithSearch() {
        for (int i = 0; i < nama.length; i++) {
            if(nama[i].charAt(2) == 'n' && nama[i].charAt(3) == 'a'){
                System.out.print(nama[i]+", ");
            }
        }
    }
    public void getNamaWithSort(int s) {
        if(s == 1){
            Arrays.sort(this.nama);
        }else if (s == 0) {
            Arrays.sort(this.nama,Collections.reverseOrder());
            
        }
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+", ");
        }
    }
}
