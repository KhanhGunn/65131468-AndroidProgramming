package gun.edu.ontapmenu;

public class MonAn {
    private String tenMonAn;
    private double donGia;
    private String moTa;
    private int idAnhMinhHoa;

    public MonAn(String tenMonAn, double donGia, String moTa, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public String getTenMonAn() { return tenMonAn; }
    public double getDonGia() { return donGia; }
    public String getMoTa() { return moTa; }
    public int getIdAnhMinhHoa() { return idAnhMinhHoa; }
}