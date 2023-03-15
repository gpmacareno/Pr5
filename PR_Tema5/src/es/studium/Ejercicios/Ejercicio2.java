package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblNombre = new Label("Celsius");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("Fahrenheit");
	TextField txtNombre2 = new TextField(20);
	Button btnCalcular = new Button("Celsius a Fahrenheit");
	Button btnCalcular2 = new Button("Fahrenheit a Celsius");

	Ejercicio2()
	{
		ventana.setBackground(Color.pink);
		ventana.setSize(400, 100);
		ventana.setLayout(new GridLayout(3, 2));
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		btnCalcular2.addActionListener(this);
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnCalcular);
		ventana.add(btnCalcular2);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);

	}

	public static double CelsiusaFarehentis(double celsius) // Creamos método y lo guardamos en una variable llamada
															// Celsius. Como en ED.
	{
		return (celsius * 9 / 5) + 32;
	}

	public static double FahrenheitaCelsius(double fahrenheit) // Creamos método y lo guardamos en una variable llamada
																// Fahrenheit. Como en ED.
	{
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main(String[] args)
	{

		new Ejercicio2();

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
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(btnCalcular))
		{
			if (!txtNombre.getText().equals("")) //! Te dice lo contrario de lo que dice atras.
			{

				double celsius = Double.parseDouble(txtNombre.getText()); // Damos el valor a la variable celsius.
				txtNombre2.setText(String.valueOf(CelsiusaFarehentis(celsius))); // Usamos el método que usabamos antes.
			} // string.valueof. Convierte automáticamente el valor pasado (doble) a una
				// cadena.

		} else if (e.getSource().equals(btnCalcular2))
		{
			if (!txtNombre2.getText().equals(""))
			{

				double fahrenheit = Double.parseDouble(txtNombre2.getText());
				txtNombre.setText(String.valueOf(FahrenheitaCelsius(fahrenheit)));
			}
		}

	}

}
