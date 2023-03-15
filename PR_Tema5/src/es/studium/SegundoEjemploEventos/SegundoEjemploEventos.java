package es.studium.SegundoEjemploEventos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SegundoEjemploEventos implements ActionListener, WindowListener, KeyListener, MouseListener
{
	Frame ventana = new Frame("Ejemplo2");
	TextField txtNombre = new TextField(30);
	TextField txtNombre2 = new TextField(30);
	Button btnSumar = new Button("Sumar");
	Button btnRestar = new Button("Restar");
	Button btnProducto = new Button("Producto");
	Button btnDividir = new Button("Dividir");
	TextField txtNombre3 = new TextField(30);
	Button btnCerrar = new Button("Cerrar");
	Panel pnltxt = new Panel();
	Panel pnlBoton = new Panel();

	SegundoEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(270, 310);
		ventana.addWindowListener(this);
		btnCerrar.addActionListener(this);
		btnSumar.addActionListener(this);
		btnRestar.addActionListener(this);
		btnProducto.addActionListener(this);
		btnDividir.addActionListener(this);
		ventana.add(txtNombre);
		ventana.add(txtNombre2);
		ventana.add(btnSumar);
		ventana.add(btnRestar);
		ventana.add(btnProducto);
		ventana.add(btnDividir);
		ventana.add(txtNombre3);
		ventana.add(btnCerrar);
		txtNombre3.setEditable(false);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new SegundoEjemploEventos();

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
	public void actionPerformed(ActionEvent e)
	{

		double uno, dos;
		double resultado;

		if (e.getSource().equals(btnSumar))
		{
			// Coger Valor de txt uno
			uno = Double.parseDouble(txtNombre.getText());
			// Coger Valor de txt dos
			dos = Double.parseDouble(txtNombre2.getText());
			// Sumar
			resultado = uno + dos;
			// Poner en txtResultado la suma
			txtNombre3.setText(resultado + "");
		} else if (e.getSource().equals(btnRestar))
		{
			uno = Double.parseDouble(txtNombre.getText());
			dos = Double.parseDouble(txtNombre2.getText());
			resultado = uno - dos;
			txtNombre3.setText(resultado + "");

		}

		else if (e.getSource().equals(btnProducto))
		{
			uno = Double.parseDouble(txtNombre.getText());
			dos = Double.parseDouble(txtNombre2.getText());
			resultado = uno * dos;
			txtNombre3.setText(resultado + "");

		} else if (e.getSource().equals(btnDividir))
		{
			uno = Double.parseDouble(txtNombre.getText());
			dos = Double.parseDouble(txtNombre2.getText());
			resultado = uno/dos;
			txtNombre3.setText(resultado+"");
			
		}
		else if(e.getSource().equals(btnCerrar))
		{
			System.out.println("Me estoy cerrando");
			System.exit(0);
		}

	}


	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e)
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

}
