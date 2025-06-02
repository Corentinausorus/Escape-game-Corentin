package Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Deplacement extends JPanel implements KeyListener {

    private int x = 100, y = 100; // Position initiale du personnage
    private final int VITESSE = 10;

    public Deplacement() {
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dessiner le fond
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dessiner le personnage (rectangle rouge ici)
        g.setColor(Color.RED);
        g.fillRect(x, y, 40, 40);
    }

    // Gestion des touches
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> y -= VITESSE;
            case KeyEvent.VK_DOWN -> y += VITESSE;
            case KeyEvent.VK_LEFT -> x -= VITESSE;
            case KeyEvent.VK_RIGHT -> x += VITESSE;
        }
        repaint();
    }

    // Pas utilisés mais nécessaires
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    
}