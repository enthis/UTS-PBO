public class SoalKedua {
    public static void main(String[] args) {
        int jumlahDiterima = 0, jumlahDicadanggkan = 0,jumlahDitolak = 0;
        MahasiswaKedua[] mhs = new MahasiswaKedua[3];
        mhs[0] = new MahasiswaKedua("Harits" ,"1234567",89);
        mhs[1] = new MahasiswaKedua("Bonang" ,"1234568", 78);
        mhs[2] = new MahasiswaKedua("Anggit" ,"1234569", 61);
        System.out.println("Daftar Nilai MK-PBO Kelas KJ201");
        String tbl = "| %-2s | %-9s| %-8s | %-8s | %-17s |%n";
        System.out.format("+----+----------+----------+----------+-------------------+%n");
        System.out.format("| No | NIM      | NAMA     |Nilai PBO |Predikat           |%n");
        System.out.format("+----+----------+----------+----------+-------------------+%n");
        for (int i = 0; i < mhs.length; i++) {    
            System.out.format(tbl, i + 1, mhs[i].getNim(),mhs[i].getNama(),mhs[i].getIpk(),mhs[i].getKeterangan());
            if(mhs[i].getStatus() == 1){
                jumlahDiterima = jumlahDiterima + 1;
            }else if (mhs[i].getStatus() == 2) {
                jumlahDicadanggkan = jumlahDicadanggkan + 1;
            }else if (mhs[i].getStatus() == 0) {
                jumlahDitolak = jumlahDitolak + 1;
            }
        }
        System.out.format("+----+----------+----------+----------+-------------------+%n");
        System.out.println("Jumlah Predikat 'Sangat Memuaskan'  = "+jumlahDiterima);
        System.out.println("Jumlah Predikat 'Memuaskan' = "+ jumlahDicadanggkan);
        System.out.println("Jumlah Predikat 'Cukup' = "+jumlahDitolak);
    }
}
