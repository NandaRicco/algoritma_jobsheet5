public class MainnilaiMhs14 {

    public static void main(String[] args) {
        
        nilaiMhs14[] data = {
            new nilaiMhs14("Ahmad", "220101001", 2022, 78, 82),
            new nilaiMhs14("Budi", "220101002", 2022, 85, 88),
            new nilaiMhs14("Cindy", "220101003", 2021, 90, 87),
            new nilaiMhs14("Dian", "220101004", 2021, 76, 79),
            new nilaiMhs14("Eko", "220101005", 2023, 92, 95),
            new nilaiMhs14("Fajar", "220101006", 2020, 82, 85),
            new nilaiMhs14("Gina", "220101007", 2023, 80, 83),
            new nilaiMhs14("Hadi", "220101008", 2020, 82, 84)
        };

        nilaiMhs14 nilaiMhs = new nilaiMhs14("", "", 0, 0, 0);

        int maxUTS = nilaiMhs.utsTertinggi(data, 0, data.length - 1);
        int minUTS = nilaiMhs.utsTerendah(data, 0, data.length - 1);
        double avgUAS = nilaiMhs.rataUAS(data);

        System.out.println("Nilai UTS Tertinggi: " + maxUTS);
        System.out.println("Nilai UTS Terendah: " + minUTS);
        System.out.println("Rata-rata Nilai UAS: " + avgUAS);
    }
}
