import java.util.*;
public class DaftarNamaKeEmpat {
    String[] nama = new String[9];
    DaftarNamaKeEmpat(){
        nama[0] = "Anton";
        nama[1] = "Yusuf";
        nama[2] = "Azzah";
        nama[3] = "Jojon";
        nama[4] = "Yunarso";
        nama[5] = "Naura";
        nama[6] = "Yuhana";
        nama[7] = "Yunus";
        nama[8] = "Aisyah";
    }
    public void getNamaWithSearch() {
        for (int i = 0; i < nama.length; i++) {
            if(nama[i].charAt(0) == 'Y' && nama[i].charAt(1) == 'u'){
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
