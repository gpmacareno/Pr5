package es.studium.Ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements MouseListener, WindowListener, ItemListener, ActionListener
{
	Frame ventana = new Frame("Horas y minutos");
	Label lblNombre = new Label("HH");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("MM");
	TextField txtNombre2 = new TextField(20);
	Label lblNombre3 = new Label("HH");
	TextField txtNombre3 = new TextField(20);
	Label lblNombre4 = new Label("MM");
	TextField txtNombre4 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtNombre5 = new TextField(20);

	Ejercicio1()
	{

		ventana.setBackground(Color.darkGray);
		ventana.setSize(400, 100);
		ventana.setLayout(new GridLayout(3, 4));
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(lblNombre3);
		ventana.add(txtNombre3);
		ventana.add(lblNombre4);
		ventana.add(txtNombre4);
		ventana.add(btnCalcular);
		txtNombre5.setEditable(false); // Set editable para que salga en gris y el usuario no pueda interactuar.
										// TEnemos el set enable
		ventana.add(txtNombre5);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Ejercicio1();

	}

	@Override
	public void itemStateChanged(ItemEvent e)
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
	public void actionPerformed(ActionEvent e)
	{
		int uno, dos, tres, cuatro;

		

			uno = Integer.parseInt(txtNombre.getText());
			dos = Integer.parseInt(txtNombre2.getText());
			tres = Integer.parseInt(txtNombre3.getText());
			cuatro = Integer.parseInt(txtNombre4.getText());
			int horas = Math.abs((uno*60+dos)-(tres*60+cuatro));
			txtNombre5.setText(String.format("%02d:%02d", horas/60, horas%60));

			

		

	}

}