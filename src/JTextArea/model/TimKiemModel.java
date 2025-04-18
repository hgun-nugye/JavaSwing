package JTextArea.model;

public class TimKiemModel {
    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public TimKiemModel() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void TimKiem() {
        int dem = 0;
        int index = 0;
        while (true) {
            int i = this.vanBan.indexOf(this.tuKhoa, index);
            if (i == -1) {
                //khong thay
                break;
            } else {
                dem++;
                index = i + 1;
            }
        }
        this.ketQua = "Kết quả: có " + dem + " " + this.tuKhoa;
        System.out.println(ketQua);
    }
}
