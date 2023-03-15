package es.studium.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener, ItemListener
{
	Frame ventana = new Frame("Aficiones");

	Checkbox checkbox1 = new Checkbox("Correr");
	Checkbox checkbox2 = new Checkbox("Nadar");
	Checkbox checkbox3 = new Checkbox("Andar");
	Checkbox checkbox4 = new Checkbox("Leer");
	Checkbox checkbox5 = new Checkbox("Ir al Cine");
	Checkbox checkbox6 = new Checkbox("Bailar");
	Checkbox checkbox7 = new Checkbox("Fútbol");
	Checkbox checkbox8 = new Checkbox("Tenis");
	Checkbox checkbox9 = new Checkbox("Baloncesto");
	Checkbox checkbox10 = new Checkbox("Deportes de Vela");

	Button btnComprobar = new Button("Comprobar");

	Panel pnlCheckboxes = new Panel();
	Panel pnlBoton = new Panel();

	Ejercicio4()
	{

		ventana.setBackground(Color.green);

		ventana.setSize(350, 190);

		ventana.setLayout(new BorderLayout());
		ventana.addWindowListener(this);
		btnComprobar.addActionListener(this);
		
		pnlCheckboxes.setLayout(new FlowLayout());
		pnlCheckboxes.add(checkbox1);
		pnlCheckboxes.add(checkbox2);
		pnlCheckboxes.add(checkbox3);
		pnlCheckboxes.add(checkbox4);
		pnlCheckboxes.add(checkbox5);
		pnlCheckboxes.add(checkbox6);
		pnlCheckboxes.add(checkbox7);
		pnlCheckboxes.add(checkbox8);
		pnlCheckboxes.add(checkbox9);
		pnlCheckboxes.add(checkbox10);

		pnlBoton.setLayout(new FlowLayout());
		pnlBoton.add(btnComprobar);

		ventana.add(pnlCheckboxes, "Center");
		ventana.add(pnlBoton, "South");

		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio4();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (checkbox1.getState())
		{
			System.out.println(checkbox1.getLabel());
		}
		if (checkbox2.getState())
		{
			System.out.println(checkbox2.getLabel());
		}
		if (checkbox3.getState())
		{
			System.out.println(checkbox3.getLabel());
		}
		if (checkbox4.getState())
		{
			System.out.println(checkbox4.getLabel());
		}
		if (checkbox5.getState())
		{
			System.out.println(checkbox5.getLabel());
		}
		if (checkbox6.getState())
		{
			System.out.println(checkbox6.getLabel());
		}
		if (checkbox7.getState())
		{
			System.out.println(checkbox7.getLabel());
		}
		if (checkbox8.getState())
		{
			System.out.println(checkbox8.getLabel());
		}
		if (checkbox9.getState())
		{
			System.out.println(checkbox9.getLabel());
		}
		if (checkbox10.getState())
		{
			System.out.println(checkbox10.getLabel());
		}

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
	public void itemStateChanged(ItemEvent e)
	{
		// TODO Auto-generated method stub

	}
}
