public class nilaiMhs14 {

    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    nilaiMhs14(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int utsTertinggi (nilaiMhs14[] data, int l, int r){
        if (l == r) {
            return data[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int lMax = utsTertinggi(data, l, mid);
        int rMax = utsTertinggi(data, mid + 1, r);

        if (lMax > rMax) {
            return lMax;
        } else {
            return rMax;
        }
    }

    int utsTerendah (nilaiMhs14[] data, int l, int r){
        if (l == r) {
            return data[l].nilaiUTS;
        } 

        int mid = (l + r) / 2;
        int lMin = utsTerendah(data, l, mid);
        int rMin = utsTerendah(data, mid + 1, r);

        if (lMin < rMin) {
            return lMin;
        } else {
            return rMin;
        }
    }

    double rataUAS (nilaiMhs14[] data){
        int sum = 0;
        for (nilaiMhs14 mhs : data){
            sum += mhs.nilaiUAS;
        }
        return (double) sum / data.length;
    }
}
