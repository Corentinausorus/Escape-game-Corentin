package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZoneDeJeu extends JPanel implements KeyListener{
	private int x = 100, y = 100, vitesse = 10;
	
	public ZoneDeJeu() {
		setFocusable(true);
        addKeyListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(x,y,50,50);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			y -= vitesse;
		}
		if (code == KeyEvent.VK_DOWN) {
			y += vitesse;
		}
		if (code == KeyEvent.VK_LEFT) {
			x -= vitesse;
		}
		if (code == KeyEvent.VK_RIGHT) {
			x += vitesse;
		}
		if (code == KeyEvent.VK_A) {
			vitesse = vitesse+10;
		}
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
