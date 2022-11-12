public class SoalPertama {
    public static void main(String[] args) {
        int jumlahDiterima = 0, jumlahDicadanggkan = 0,jumlahDitolak = 0;
        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa("Harits" ,"1234567",3.7, 'A');
        mhs[1] = new Mahasiswa("Bonang" ,"1234568", 3.2, 'A');
        mhs[2] = new Mahasiswa("Anggit" ,"1234569", 4.0, 'B');
        System.out.println("Daftar Nilai MK-PBO Kelas KJ201");
        System.out.println("+----+----------+----------+----+----------+----------------------+");
        System.out.println("| No | NIM      | NAMA     |IPK |Nilai PBO |Keterangan            |");
        System.out.println("+----+----------+----------+----+----------+----------------------+");
        for (int i = 0; i < mhs.length; i++) {    
            System.out.println("| "+(i + 1)+"  |"+mhs[i].getNim()+"   |"+mhs[i].getNama()+"    |"+mhs[i].getIpk()+" |"+mhs[i].getNilaiPBO()+"         |"+mhs[i].getKeterangan()+"|");
            if(mhs[i].getStatus() == 1){
                jumlahDiterima = jumlahDiterima + 1;
            }else if (mhs[i].getStatus() == 2) {
                jumlahDicadanggkan = jumlahDicadanggkan + 1;
            }else if (mhs[i].getStatus() == 0) {
                jumlahDitolak = jumlahDitolak + 1;
            }
        }
        System.out.println("+----+----------+----------+----+----------+----------------------+");
        System.out.println("Jumlah yang di terima Aslab PBO  = "+jumlahDiterima);
        System.out.println("Jumlah yang di cadangan Aslab PBO = "+ jumlahDicadanggkan);
        System.out.println("Jumlah yang di ditolak Aslab PBO = "+jumlahDitolak);
    }
}
