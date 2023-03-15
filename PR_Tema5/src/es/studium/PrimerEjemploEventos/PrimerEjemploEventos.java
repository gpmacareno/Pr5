package es.studium.PrimerEjemploEventos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Listener. Son unas clases que permite estar pendiente de los eventos que ocurra en un bot�n.

public class PrimerEjemploEventos implements ActionListener, WindowListener
{

	Frame ventana = new Frame("Eventos");
	Button btnCerrar = new Button("Cerrar");
	Button btnMensaje = new Button("Mensaje");

	PrimerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(250, 100);
		ventana.addWindowListener(this);
		btnCerrar.addActionListener(this); // This se refiere al boton dentro de esta ventana.
		btnMensaje.addActionListener(this);
		ventana.add(btnCerrar);
		ventana.add(btnMensaje);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{

		new PrimerEjemploEventos();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource().equals(btnMensaje))
		{
			System.out.println("Mensaje por consola");
		}

		else if(e.getSource().equals(btnCerrar))
		{
			System.out.println("Me estoy cerrando");
			System.exit(0);
		}

	}

	@Override
	public void windowOpened(WindowEvent e)
	{
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
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}

}
