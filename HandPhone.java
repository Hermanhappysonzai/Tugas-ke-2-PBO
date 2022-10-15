
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    String public setHandPhone(String jenis_hp, int tahun_pembuatan){
        jenis_Hp  = jenis_Hp;
        tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenis_hp() {
        return jenis_hp;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp  = new HandPhone();
        hp.setDataHp(jenis_hp, tahun_pembuatan);
        System.out.println("Jenis Hp :"+jenis_hp);
        System.out.println("Tahun Pembuatan :"+tahun_pembuatan);
    }
    
}
