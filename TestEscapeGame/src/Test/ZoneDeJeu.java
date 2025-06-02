package Test;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;


public class ZoneDeJeu extends JPanel implements KeyListener{
    private int x = 100, y = 100, vitesse = 10;
    static String posture;

    private Image fond;
    private Image persoDroite;
    private Image persoGauche;
    private Image persoDos;
    private Image persoFace;

    public ZoneDeJeu() {
        setFocusable(true);
        addKeyListener(this);
        try {
            fond = ImageIO.read(getClass().getResource("fond.png"));
            persoGauche = ImageIO.read(getClass().getResource("PersoGauche.png"));
            persoDroite = ImageIO.read(getClass().getResource("PersoDroit.png"));
            persoFace = ImageIO.read(getClass().getResource("PersoFace.png"));
            persoDos = ImageIO.read(getClass().getResource("PersoDos.png"));
            System.out.println("fond = " + fond);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fond,0,0,getWidth(),getHeight(),this);
        if (posture == "UP"){
            g.drawImage(persoDos,x,y,getWidth()/10,getHeight()/10,this);

        }
        if (posture == "DOWN"){
            g.drawImage(persoFace,x,y,getWidth()/10,getHeight()/10,this);
        }
        if (posture == "LEFT"){
            g.drawImage(persoGauche,x,y,getWidth()/10,getHeight()/10,this);
        }
        if (posture == "RIGHT"){
            g.drawImage(persoDroite,x,y,getWidth()/10,getHeight()/10,this);
        }


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
            posture = "UP";
        }
        if (code == KeyEvent.VK_DOWN) {
            y += vitesse;
            posture = "DOWN";
        }
        if (code == KeyEvent.VK_LEFT) {
            x -= vitesse;
            posture = "LEFT";
        }
        if (code == KeyEvent.VK_RIGHT) {
            x += vitesse;
            posture = "RIGHT";
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
