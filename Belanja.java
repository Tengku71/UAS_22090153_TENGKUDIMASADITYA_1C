import java.util.ArrayList;

public class Belanja {
    private String NamaBarang;
    private int HargaBarang;
    private int JumBelanja;


    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        HargaBarang = hargaBarang;
    }

    public int getJumBelanja() {
        return JumBelanja;
    }

    public void setJumBelanja(int jumBelanja) {
        JumBelanja = jumBelanja;
    }

    public void Belanja(){}
    public void Belanja(String NamaBarang, int HargaBarang, int JumBelanja){
        this.NamaBarang = NamaBarang;
        this.HargaBarang = HargaBarang;
        this.JumBelanja = JumBelanja;
    }

    public static Object CetakInvoice(ArrayList<Belanja> data){
        for(int i = 0; i<data.size(); i++) {
            System.out.println("Item Name =\t"+ data.get(i).NamaBarang +"   \tJumlah =\t   "+ data.get(i).JumBelanja+ "   \tHarga =\t   " + data.get(i).HargaBarang);
        }
        for(int i = 0; i< data.size(); i++){
            int harga = data.get(i).HargaBarang * data.get(i).JumBelanja;
            int totalharga = data.get(i).JumBelanja + harga;

            System.out.println("Total Harga =\t" + totalharga);
        }
        return data;
    }

}
