package es.studium.Ejercicios;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 implements WindowListener, ActionListener, ItemListener, MouseListener
{
	Frame ventana = new Frame("Equipos de Baloncesto");
	List lista = new List(5, false);
	String[] equipos =
	{ "Seleccione un equipo", "Real Madrid", "Barça", "Iberoestar Tenerife", "TD Systems Baskonia",
			"Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur Real Betis", "RETAbet Bilbao Basket",
			"Acunsa Gipuzkoa Basket" };

	String[] ciudades =
	{ "No ha seleccionado un equipo", "Madrid", "Barcelona", "Tenerife", "Vitoria-Gasteiz", "Burgos", "Valencia", "Badalona",
			"Huelva", "Murcia", "Manresa", "Andorra", "Gran Canaria", "Obradoiro", "Madrid", "Zaragoza", "Fuenlabrada",
			"Sevilla", "Bilbao", "Gipuzkoa" };

	Label ciudad;

	public Ejercicio7()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(400, 200);
		ventana.addWindowListener(this); 
		for (String equipos : equipos)
		{

			lista.add(equipos);

		}
		ventana.add(lista);
		lista.addItemListener(this);
		ciudad = new Label("Seleccione un equipo");
		ventana.add(ciudad);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio7();
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
	public void itemStateChanged(ItemEvent e)
	{
		int indice = lista.getSelectedIndex(); //Nos permite que al seleccionar uno de la lista, en la tabla pase un evento.
		if (indice >= 0) { //Mientras que el indice, sea mayor o igual a cero, el label
			ciudad.setText("Ciudad: " + ciudades[indice]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
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
