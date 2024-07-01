public class MainMahasiswaLat2 {
    public static void main(String[] args) {
        MahasiswaLat2 mhs1 = new MahasiswaLat2();
        mhs1.setNim("233210008");
        mhs1.setNama("Dita Putri Utami");
        mhs1.setProdi("Sistem Informasi Akuntansi");
        mhs1.setSks(21);
        mhs1.setIpk(3.98);

        System.out.println("Data Mahasiswa");

        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Prodi: " + mhs1.getProdi());
        System.out.println("SKS: " + mhs1.getSks());
        System.out.println("IPK: " + mhs1.getIpk());
		}
}