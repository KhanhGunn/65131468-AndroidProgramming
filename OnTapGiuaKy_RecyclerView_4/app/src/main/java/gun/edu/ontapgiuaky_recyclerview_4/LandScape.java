package gun.edu.ontapgiuaky_recyclerview_4;

public class LandScape {
    String imageFileName;
    String caption;
    public LandScape(String imageFileName, String caption) {
        this.imageFileName = imageFileName;
        this.caption = caption;
    }
    public String getImageFileName() { return imageFileName; }
    public void setImageFileName(String imageFileName) { this.imageFileName = imageFileName; }
    public String getCaption() { return caption; }
    public void setCaption(String caption) { this.caption = caption; }
}
