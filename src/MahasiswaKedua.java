import java.util.Set;

public class MahasiswaKedua {
    String nama,nim,keterangan;
    double ipk;
    char nilaiPBO;
    int status;
    MahasiswaKedua(String sNama,String sNim,double iIpk){
        nama = sNama;
        nim = sNim;
        ipk = iIpk;
        this.setKeterangan(iIpk);
    }

    public void setKeterangan(double iIpk) {
        if (iIpk >= 88 && iIpk <= 100 ) {
            this.keterangan = "Sangat Memuaskan";
            this.status = 1;
        } else if(iIpk >= 77 && iIpk < 88 ) {
            this.keterangan = "Memuaskan";
            this.status = 2;

        } else {
            this.keterangan = "Cukup";
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
