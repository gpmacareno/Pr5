package es.studium.CuartoEjemploEventos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoEjemploEventos implements MouseListener, WindowListener, ItemListener
{

	Frame ventana = new Frame("Eventos");
	Choice choLista = new Choice();

	CuartoEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.darkGray);
		ventana.setSize(250, 210);
		ventana.addWindowListener(this);
		ventana.addMouseListener(this);
		choLista.add("Seleccionar un color.... ");
		choLista.add("Azul");
		choLista.add("Magenta");
		choLista.add("Cyan");
		choLista.add("Rosa");
		choLista.add("Rojo");
		choLista.add("Verde");
		choLista.addItemListener(this);
		ventana.add(choLista);

		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new CuartoEjemploEventos();
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

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

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
	public void itemStateChanged(ItemEvent e) // Eventos para cambiar el fondo de pantalla segun la elección que hagamos
												// en el Choice.
	{

		if (e.getItem().equals("Azul"))
		{

			ventana.setBackground(Color.blue);
		}

		else if (e.getItem().equals("Magenta"))
		{

			ventana.setBackground(Color.magenta);
		}

		else if (e.getItem().equals("Cyan"))
		{

			ventana.setBackground(Color.cyan);
		} else if (e.getItem().equals("Rosa"))
		{

			ventana.setBackground(Color.pink);
		} else if (e.getItem().equals("Rojo"))
		{

			ventana.setBackground(Color.red);
		} else if (e.getItem().equals("Verde"))
		{

			ventana.setBackground(Color.green);
		} else if (e.getItem().equals("Seleccionar un color.... "))
		{

			ventana.setBackground(Color.darkGray);
		}

	}

}
