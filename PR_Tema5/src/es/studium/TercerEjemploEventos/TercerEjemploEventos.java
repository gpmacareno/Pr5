package es.studium.TercerEjemploEventos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TercerEjemploEventos implements MouseListener, WindowListener //Llamamos al Mouse Listener que es el "oyente" del ratón.
{

	Frame ventana = new Frame("Ratón");

	TercerEjemploEventos()
	{

		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.yellow);
		ventana.setSize(270, 310);
		ventana.addWindowListener(this);
		ventana.addMouseListener(this); //Añadimos a la ventana el mouse listener.
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new TercerEjemploEventos();

	}

	@Override
	public void mouseClicked(MouseEvent e) //Cuando clickamos
	{
		System.out.println("X: " + e.getX()); //Obtenemos la coordenada X al clickar.
		System.out.println("y: " + e.getY()+ "\n"); //Obtenemos la coordenada Y al clickar.
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}
}
