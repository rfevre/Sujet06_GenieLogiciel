package image;
import dictionnaire.*;

public abstract class ImageSuperDict extends ImageQuelconque {
    protected Dictionnaire points;

    public ImageSuperDict(int w, int h) {
	super(w,h);
	this.initialiserPoints();
    }

    protected void initialiserPoints() {
	points = new TabDict();
    }

    public abstract NiveauGris pointEn(int x, int y);

    public abstract void definirPoint(int x, int y, NiveauGris gris);
}
