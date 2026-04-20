package gun.edu.thigk2nguyenquockhanh;

public class HistoricalFigure {
    private String name;
    private String hometown;
    private int imageResId;

    public HistoricalFigure(String name, String hometown, int imageResId) {
        this.name = name;
        this.hometown = hometown;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public int getImageResId() {
        return imageResId;
    }
}