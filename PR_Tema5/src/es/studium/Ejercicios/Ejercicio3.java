package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Calcular el IVA");
	Label lblNombre = new Label("Introduzca la cantidad");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("Introduzca el porcentaje");
	TextField txtNombre2 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblNombre3 = new Label("Resultado");
	TextField txtNombre3 = new TextField(20);
	
	Dialog dlgMensaje = new Dialog(ventana, "Error", true); //Debemos indicar, a que frame esta asociado, el segundo el titulo y el tercero si es modal o no.
	Label lblMensaje = new Label("Métele un número");	 //Modal es que impide interactuar a menos que hagas lo que dice el dialogo.
	Ejercicio3()
	{

		ventana.setBackground(Color.green);
		ventana.setSize(1000, 70);
		ventana.setLayout(new GridLayout(1, 7));
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnCalcular);
		ventana.add(lblNombre3);
		txtNombre3.setEnabled(false);
		ventana.add(txtNombre3);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);

		dlgMensaje.setSize(550,550);
		dlgMensaje.setBackground(Color.pink);
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setLayout(new FlowLayout());
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setResizable(false);
		

	}

	public static void main(String[] args)
	{
		new Ejercicio3();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{

			double cantidad = Double.parseDouble(txtNombre.getText());
			double porcentaje = Double.parseDouble(txtNombre2.getText());
			double iva = (cantidad * porcentaje) / 100;

			txtNombre3.setText(String.valueOf(iva) + "€");
		} catch (NumberFormatException nfe)
		{
			System.out.println("Metele un numero");
			System.out.println("Error: "+ nfe.getMessage());
			txtNombre3.setText("Metele un numero");
			dlgMensaje.setVisible(true);

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
		if(dlgMensaje.isActive()) {
			dlgMensaje.setVisible(false);
			txtNombre.setText("");
			txtNombre2.setText("");
			txtNombre3.setText("");

		}
		else {
			System.exit(0);
		}
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
