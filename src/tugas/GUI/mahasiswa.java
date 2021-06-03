package tugas.GUI;

public class mahasiswa {
    private String nama;
    private String nim;

    public mahasiswa(){
    }

    public mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "TIDAK DITEMUKAN";
    }

    public String angkatan() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "TIDAK DITEMUKAN";

        }
    }

    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Sains dan Teknologi";
        }else if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Tarbiyah dan Keguruan";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas Syariah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Ushuluddin";
        }else if (fac.equalsIgnoreCase("4")) {
            return "Fakultas Dakwah dan Komunikasi";
        }else if (fac.equalsIgnoreCase("6")) {
            return "Fakultas Psikologi";
        }else if (fac.equalsIgnoreCase("7")) {
            return "Fakultas Ekonomi dan Ilmu Sosial";
        }else if (fac.equalsIgnoreCase("8")) {
            return "Fakultas Pertanian dan Peternakan";
        }else {
            return "TIDAK DITEMUKAN";
        }
    }


    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "TIDAK DITEMUKAN";
    }

    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "TIDAK DITEMUKAN";
    }

    public String noMhs() {
        return this.nim.substring(7,11);
    }
}
