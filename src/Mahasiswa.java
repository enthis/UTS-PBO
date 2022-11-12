import java.util.Set;

public class Mahasiswa {
    String nama,nim,keterangan;
    double ipk;
    char nilaiPBO;
    int status;
    Mahasiswa(String sNama,String sNim,double iIpk,char iNilaiPBO){
        nama = sNama;
        nim = sNim;
        nilaiPBO = iNilaiPBO;
        ipk = iIpk;
        this.setKeterangan(iIpk, iNilaiPBO);
    }

    public void setKeterangan(double iIpk,char cNilaiPBO) {
        if (iIpk >= 3.5 &&  cNilaiPBO == 'A') {
            this.keterangan = "Diterima AslabPBO";
            this.status = 1;
        } else if(3.5 > iIpk && iIpk >= 3 && cNilaiPBO == 'A') {
            this.keterangan = "Cadangan AslabPBO";
            this.status = 2;

        } else {
            this.keterangan = "Ditolak AslabPBO";
            this.status = 0;
        }
    }
    public int getStatus() {
        return status;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public double getIpk() {
        return ipk;
    }
    public String getNama() {
        return nama;
    }
    public char getNilaiPBO() {
        return nilaiPBO;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNilaiPBO(char nilaiPBO) {
        this.nilaiPBO = nilaiPBO;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
}
