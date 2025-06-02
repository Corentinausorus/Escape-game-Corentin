package Test;
import javax.swing.JFrame;

public class Dessin extends JFrame{
	int x, y;
	
	public Dessin(int x,int y) {
		this.x = x;
		this.y = y;
		setSize(x,y);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ZoneDeJeu zone = new ZoneDeJeu();
		add(zone);
		zone.requestFocusInWindow();
	}
}
